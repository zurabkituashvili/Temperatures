# <div _ngcontent-msn-c210="" id="programming-exercise-instructions-content" class="guided-tour instructions__content__markdown markdown-preview"><h3 id="temperature">Temperature</h3>
<p>For this assignment we provide a class <code>Temperature</code> which represents a data set.
Moreover, there is a class <code>Temperatures</code> which provides a method <code>stream()</code>. In order to text your methods,
you should download
<a rel="noopener noreferrer" href="https://syncandshare.lrz.de/dl/fiPtdayL2bfyFNf4omTt8ftr/temperaturesEurope1963Till2013ByCity.zip">this file</a>,
unzip and store it into the topmost directory of your assignment (i.e., directly into the directory with name
<em>fop20w9temp…</em>).
If you encounter problems with reading this file, you may also adapt the path given in the main method of
the class
<code>StreamTemperatures</code>.</p>
<p><strong>important! By no means push this file! The Template should prohibit this, but when you rename/copy this file,
you yourself must take care that this will not happen</strong></p>
<p>Implement now all methods from the class <code>StreamTemperatures</code>:</p>
<ul>
<li><div class="pe-task-0 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-msn-c208="" class="ng-star-inserted"><div _ngcontent-msn-c208="" class="guided-tour success">
    <fa-icon _ngcontent-msn-c208="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-msn-c208="" class="task-name ng-star-inserted">long size()</span><!---->
    <span _ngcontent-msn-c208="" class="guided-tour test-status--linked text-success ng-star-inserted">
    
    <!---->
</div>
</jhi-programming-exercise-instructions-task-status></div>for the number of measurements,</li>
<li><div class="pe-task-1 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-msn-c208="" class="ng-star-inserted"><div _ngcontent-msn-c208="" class="guided-tour success">
    <fa-icon _ngcontent-msn-c208="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-msn-c208="" class="task-name ng-star-inserted">List&lt;Date&gt; dates()</span><!---->
    <span _ngcontent-msn-c208="" class="guided-tour test-status--linked text-success ng-star-inserted">
    
    <!---->
</div>
</jhi-programming-exercise-instructions-task-status></div>for the list of all ascendingly sorted days at which temperatures have been measured (no duplicates!)</li>
<li><div class="pe-task-2 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-msn-c208="" class="ng-star-inserted"><div _ngcontent-msn-c208="" class="guided-tour success">
    <fa-icon _ngcontent-msn-c208="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-msn-c208="" class="task-name ng-star-inserted">Set&lt;String&gt; cities()</span><!---->
    <span _ngcontent-msn-c208="" class="guided-tour test-status--linked text-success ng-star-inserted">
    
    <!---->
</div>
</jhi-programming-exercise-instructions-task-status></div>for the set of all towns where temperatures have been measured</li>
<li><div class="pe-task-3 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-msn-c208="" class="ng-star-inserted"><div _ngcontent-msn-c208="" class="guided-tour success">
    <fa-icon _ngcontent-msn-c208="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-msn-c208="" class="task-name ng-star-inserted">Set&lt;String&gt; countries()</span><!---->
    <span _ngcontent-msn-c208="" class="guided-tour test-status--linked text-success ng-star-inserted">
    
    <!---->
</div>
</jhi-programming-exercise-instructions-task-status></div>for the set of all countries where temperatures have been measured</li>
<li><div class="pe-task-4 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-msn-c208="" class="ng-star-inserted"><div _ngcontent-msn-c208="" class="guided-tour">
    <!---->
    <!---->
    <fa-icon _ngcontent-msn-c208="" size="lg" class="ng-fa-icon test-icon text-secondary ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-question" class="svg-inline--fa fa-circle-question fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M256 512c141.4 0 256-114.6 256-256S397.4 0 256 0S0 114.6 0 256S114.6 512 256 512zM169.8 165.3c7.9-22.3 29.1-37.3 52.8-37.3h58.3c34.9 0 63.1 28.3 63.1 63.1c0 22.6-12.1 43.5-31.7 54.8L280 264.4c-.2 13-10.9 23.6-24 23.6c-13.3 0-24-10.7-24-24V250.5c0-8.6 4.6-16.5 12.1-20.8l44.3-25.4c4.7-2.7 7.6-7.7 7.6-13.1c0-8.4-6.8-15.1-15.1-15.1H222.6c-3.4 0-6.4 2.1-7.5 5.3l-.4 1.2c-4.4 12.5-18.2 19-30.6 14.6s-19-18.2-14.6-30.6l.4-1.2zM288 352c0 17.7-14.3 32-32 32s-32-14.3-32-32s14.3-32 32-32s32 14.3 32 32z"></path></svg></fa-icon><!---->
    <span _ngcontent-msn-c208="" class="task-name ng-star-inserted">Map&lt;String, List&lt;Double&gt;&gt; temperaturesByCountry()</span><!---->
    
    <!---->
    
    <!---->
</div>
</jhi-programming-exercise-instructions-task-status></div>for the set of all measurements grouped by country names (ohne Test)</li>
<li><div class="pe-task-5 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-msn-c208="" class="ng-star-inserted"><div _ngcontent-msn-c208="" class="guided-tour success">
    <fa-icon _ngcontent-msn-c208="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-msn-c208="" class="task-name ng-star-inserted">String coldestCountryAbs()</span><!---->
    <span _ngcontent-msn-c208="" class="guided-tour test-status--linked text-success ng-star-inserted">
    
    <!---->
</div>
</jhi-programming-exercise-instructions-task-status></div>for the country with the colded measured temperature</li>
<li><div class="pe-task-6 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-msn-c208="" class="ng-star-inserted"><div _ngcontent-msn-c208="" class="guided-tour success">
    <fa-icon _ngcontent-msn-c208="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-msn-c208="" class="task-name ng-star-inserted">String hottestCountryAbs()</span><!---->
    <span _ngcontent-msn-c208="" class="guided-tour test-status--linked text-success ng-star-inserted">
    
    <!---->
</div>
</jhi-programming-exercise-instructions-task-status></div>for the country with the hottest measured temperature</li>
<li><div class="pe-task-7 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-msn-c208="" class="ng-star-inserted"><div _ngcontent-msn-c208="" class="guided-tour">
    <!---->
    <!---->
    <fa-icon _ngcontent-msn-c208="" size="lg" class="ng-fa-icon test-icon text-secondary ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-question" class="svg-inline--fa fa-circle-question fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M256 512c141.4 0 256-114.6 256-256S397.4 0 256 0S0 114.6 0 256S114.6 512 256 512zM169.8 165.3c7.9-22.3 29.1-37.3 52.8-37.3h58.3c34.9 0 63.1 28.3 63.1 63.1c0 22.6-12.1 43.5-31.7 54.8L280 264.4c-.2 13-10.9 23.6-24 23.6c-13.3 0-24-10.7-24-24V250.5c0-8.6 4.6-16.5 12.1-20.8l44.3-25.4c4.7-2.7 7.6-7.7 7.6-13.1c0-8.4-6.8-15.1-15.1-15.1H222.6c-3.4 0-6.4 2.1-7.5 5.3l-.4 1.2c-4.4 12.5-18.2 19-30.6 14.6s-19-18.2-14.6-30.6l.4-1.2zM288 352c0 17.7-14.3 32-32 32s-32-14.3-32-32s14.3-32 32-32s32 14.3 32 32z"></path></svg></fa-icon><!---->
    <span _ngcontent-msn-c208="" class="task-name ng-star-inserted">Map&lt;String, Double&gt; countriesAvgTemperature()</span><!---->
    
        <span _ngcontent-msn-c208="" class="text-secondary ng-star-inserted">
    <!---->
    
    <!---->
</div>
</jhi-programming-exercise-instructions-task-status></div>for names of countries with their corresponding temperatures averaged over all times and cities</li>
<li><div class="pe-task-8 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-msn-c208="" class="ng-star-inserted"><div _ngcontent-msn-c208="" class="guided-tour success">
    <fa-icon _ngcontent-msn-c208="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-msn-c208="" class="task-name ng-star-inserted">Map&lt;String, Double&gt;                                                                                          avgTemperatureDeltaPerYearPerCountry()</span><!---->
    <span _ngcontent-msn-c208="" class="guided-tour test-status--linked text-success ng-star-inserted">1 of 1 tests passing</span><!---->
    
    <!---->
</div>
</jhi-programming-exercise-instructions-task-status></div>This method returns a mapping of names of countries to their average yearly delta temperature over
the whole time span.
Furthermore, this map should contain the global average delta temperature as the average over all countries
for the key <code>Globally</code>. The delta temperature between two years is nothing but the difference between
their yearly average temperatures.
Thus, we would subtract the average temperature for the year 1900 from the average temperature for the
year 1901 for a particuar country to obtain the corresponding delta temperature.
The average delta temperature then is the average over all these deltas.</li>
</ul>
<p>Use the <code>main</code> method provided in the template in order to test your program for the given data.</p>
<p>Additionally to the methods from w9streams, our solution also uses the following methods:</p>
<ul>
<li><a rel="noopener noreferrer" href="https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#count--">count</a></li>
<li><a rel="noopener noreferrer" href="https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#sorted--">sorted</a></li>
<li><a rel="noopener noreferrer" href="https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#distinct--">distinct</a></li>
<li><a rel="noopener noreferrer" href="https://docs.oracle.com/javase/8/docs/api/java/util/stream/IntStream.html#min--">min</a>
and <a rel="noopener noreferrer" href="https://docs.oracle.com/javase/8/docs/api/java/util/stream/IntStream.html#max--">max</a></li>
<li><a rel="noopener noreferrer" href="https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#sorted-java.util.Comparator-">sorted</a>
with <a rel="noopener noreferrer" href="https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#comparing-java.util.function.Function-">comparing</a></li>
</ul></div>
