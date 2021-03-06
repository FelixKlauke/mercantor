[![license](https://img.shields.io/github/license/mashape/apistatus.svg)](https://github.com/FelixKlauke/mercantor)
[![Issues](https://img.shields.io/github/issues/FelixKlauke/mercantor.svg)](https://github.com/FelixKlauke/mercantor/issues)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/5956dd4acf2a49c0984bc8bd2b22f152)](https://www.codacy.com/app/info_101/mercantor?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=FelixKlauke/mercantor&amp;utm_campaign=Badge_Grade)

# mercantor
A simple but effective network attached service registry with optional load balancing capabilities used for service discovery in a microservice environment.


# Build Status
|             	| Build Status                                                                                                                                              	| Test Code Coverage                                                                                                                                               	|
|-------------	|-----------------------------------------------------------------------------------------------------------------------------------------------------------	|------------------------------------------------------------------------------------------------------------------------------------------------------------------	|
| Master      	| [![Build Status](https://travis-ci.org/FelixKlauke/mercantor.svg?branch=master)](https://travis-ci.org/FelixKlauke/mercantor) 	| [![codecov](https://codecov.io/gh/FelixKlauke/mercantor/branch/master/graph/badge.svg)](https://codecov.io/gh/FelixKlauke/mercantor) 	|
| Development 	| [![Build Status](https://travis-ci.org/FelixKlauke/mercantor.svg?branch=dev)](https://travis-ci.org/FelixKlauke/mercantor)    	| [![codecov](https://codecov.io/gh/FelixKlauke/mercantor/branch/dev/graph/badge.svg)](https://codecov.io/gh/FelixKlauke/mercantor)    	|


# Usage
- Install [Gradle](https://gradle.org/install/)
- Clone this repo
- Install: ```gradle build jar```

# Example
_Create client:_
```kotlin
val mercantorDiscoveryClient = MercantorDiscoveryClientFactory.
        createDiscoveryClient(MercantorDiscoveryClientConfig("http://localhost:8080"));
```
