package fop.w9temp;

import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTemperatures extends Temperatures {
    public StreamTemperatures(String filepath) {
        super(filepath);
    }

    public long size() {
        return stream().count();
    }

    public List<LocalDate> dates() { // es da qveda igivea
        return stream().map(t -> t.getDate()).distinct().sorted().collect(Collectors.toList());
    }

    public Set<String> cities() { // anu es
        return stream().map(Temperature::getCity).collect(Collectors.toSet());
    }

    public Set<String> countries() { //da esec igivea
        return stream().map(t -> t.getCountry()).collect(Collectors.toSet());
    }

    public Map<String, List<Double>> temperaturesByCountry() {
        Map<String, List<Double>> result = new HashMap<>();

        countries().forEach(country -> {
            LinkedList<Double> emptyTemperatureList = new LinkedList<>();
            result.put(country, emptyTemperatureList);
        });

        stream().forEach(temperature -> {
            String country = temperature.getCountry();
            Double temp = temperature.getTemperature();

            List<Double> temperatureList = result.get(country);
            temperatureList.add(temp);
        });

        return result;
    }

    @Override
    public Map<String, Double> countriesAvgTemperature() {
        final Map<String, Double> countryAvgTemperatures = new HashMap<>();
        temperaturesByCountry().entrySet().stream()
                .forEach(entry -> countryAvgTemperatures.put(entry.getKey(),
                        entry.getValue().stream()
                                .mapToDouble(Double::doubleValue).average()
                                .getAsDouble()));
        return countryAvgTemperatures;
    }

    @Override
    public String coldestCountryAbs() {
        return stream().min(Comparator.comparing(Temperature::getTemperature))
                .get().getCountry();
    }

    @Override
    public String hottestCountryAbs() {
        return stream().max(Comparator.comparing(Temperature::getTemperature))
                .get().getCountry();
    }

    public Map<String, Double> avgTemperatureDeltaPerYearPerCountry() {
        Map<String, List<Temperature>> tempsPerCountry = stream()
                .collect(Collectors.groupingBy(Temperature::getCountry));
        Map<String, Double> avgTempDeltaPerCountry = tempsPerCountry.entrySet()
                .stream().collect(Collectors.toMap(Entry::getKey, entry -> {
                    Map<Integer, List<Temperature>> tempsPerYear = entry
                            .getValue().stream()
                            .collect(Collectors
                                    .groupingBy(temperature -> temperature
                                            .getDate().getYear()));
                    double[] avgTempsPerYear = tempsPerYear.entrySet().stream()
                            .sorted(Comparator
                                    .comparing(entry2 -> entry2.getKey()))
                            .mapToDouble(entry2 -> entry2.getValue().stream()
                                    .mapToDouble(temp -> temp.getTemperature())
                                    .average().getAsDouble())
                            .toArray();
                    return IntStream.range(0, avgTempsPerYear.length - 1)
                            .mapToDouble(i -> avgTempsPerYear[i + 1]
                                    - avgTempsPerYear[i])
                            .average().getAsDouble();
                }));
        avgTempDeltaPerCountry.put("Globally", avgTempDeltaPerCountry.values()
                .stream().mapToDouble(it -> it).average().getAsDouble());
        return avgTempDeltaPerCountry;
    }


    public static void main(final String[] args) {
        String filepath = "temperaturesEurope1963Till2013ByCity.csv";
        StreamTemperatures temperatures = new StreamTemperatures(filepath);

        temperatures.printSummary();
        final Map<String, Double> values = temperatures
                .avgTemperatureDeltaPerYearPerCountry();

        print("Averaged yearly temperature delta per country:",
                Arrays.toString(values.entrySet().toArray()));
    }

}
