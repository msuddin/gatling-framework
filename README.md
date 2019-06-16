# sample-gatling-scala

## Purpose

Questions:
What is the purpose of this project?

Answer:
* Written a very basic simulation file that runs a simple gatling load script
* 

## Instructions
From the root directory of the project, run the following command:

Ensure you are running jdk version 8+
```
java -version

// Output
openjdk version "11.0.2" 2019-01-15
OpenJDK Runtime Environment 18.9 (build 11.0.2+9)
OpenJDK 64-Bit Server VM 18.9 (build 11.0.2+9, mixed mode)
```

Run Gatling Run to run all current simulations
```
./gradlew gatlingRun
```

Once the test has finished, the output should look like the below:
```
---- Global Information --------------------------------------------------------
> request count                                          1 (OK=1      KO=0     )
> min response time                                    229 (OK=229    KO=-     )
> max response time                                    229 (OK=229    KO=-     )
> mean response time                                   229 (OK=229    KO=-     )
> std deviation                                          0 (OK=0      KO=-     )
> response time 50th percentile                        229 (OK=229    KO=-     )
> response time 75th percentile                        229 (OK=229    KO=-     )
> response time 95th percentile                        229 (OK=229    KO=-     )
> response time 99th percentile                        229 (OK=229    KO=-     )
> mean requests/sec                                  0.167 (OK=0.167  KO=-     )
---- Response Time Distribution ------------------------------------------------
> t < 800 ms                                             1 (100%)
> 800 ms < t < 1200 ms                                   0 (  0%)
> t > 1200 ms                                            0 (  0%)
> failed                                                 0 (  0%)
================================================================================
...
...
Please open the following file: 
/Users/mohammeduddin/Documents/GitProjects/msu/sample-gatling-scala/build/reports/gatling/basicsimulation-1560682110468/index.html
```

You should also be able to open a log file
```
open <log-file-location-as-above>
```