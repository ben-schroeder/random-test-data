# random-test-data
[![Build Status](https://travis-ci.com/ben-schroeder/random-test-data.svg?branch=master)](https://travis-ci.com/ben-schroeder/random-test-data)
[![License](https://img.shields.io/github/license/ben-schroeder/random-test-data)](https://raw.githubusercontent.com/ben-schroeder/random-test-data/master/LICENSE)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/eu.benschroeder/random-test-data/badge.svg)](https://maven-badges.herokuapp.com/maven-central/eu.benschroeder/random-test-data)

Random test data for unit tests

## Requirements
* Java >= 8

## Artifacts
```
<dependency>
  <groupId>eu.benschroeder</groupId>
  <artifactId>random-test-data</artifactId>
  <version>0.7</version>
</dependency>
``` 

## Usage
```
import eu.benschroeder.testdata.WithRandomTestData;

public class MyUnitTest implements WithRandomTestData {

    @Test
    void testMyMethod() {

        final long anyId = randomLong();
        final String anyName = randomAlphabetic();
        final LocalDateTime anyLocalDateTime = randomPastLocalDateTime();

        ...

    }

}
```
