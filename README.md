For this assignment we provide a class Temperature which represents a data set. Moreover, there is a class Temperatures which provides a method stream(). In order to text your methods, you should download this file, unzip and store it into the topmost directory of your assignment (i.e., directly into the directory with name fop20w9temp…). If you encounter problems with reading this file, you may also adapt the path given in the main method of the class StreamTemperatures.

 long size() 
for the number of measurements,

 List<Date> dates() 
for the list of all ascendingly sorted days at which temperatures have been measured (no duplicates!)
    
 Set<String> cities() 
for the set of all towns where temperatures have been measured
    
 Set<String> countries() 
for the set of all countries where temperatures have been measured
    
 Map<String, List<Double>> temperaturesByCountry()
for the set of all measurements grouped by country names 
    
 String coldestCountryAbs() 
for the country with the colded measured temperature
    
 String hottestCountryAbs() 
for the country with the hottest measured temperature
    
 Map<String, Double> countriesAvgTemperature() 
for names of countries with their corresponding temperatures averaged over all times and cities
    
 Map<String, Double> avgTemperatureDeltaPerYearPerCountry()
This method returns a mapping of names of countries to their average yearly delta temperature over the whole time span. Furthermore, this map should contain the global average delta temperature as the average over all countries for the key Globally. The delta temperature between two years is nothing but the difference between their yearly average temperatures. Thus, we would subtract the average temperature for the year 1900 from the average temperature for the year 1901 for a particuar country to obtain the corresponding delta temperature. The average delta temperature then is the average over all these deltas.
