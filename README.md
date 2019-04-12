[![Build Status](https://travis-ci.com/bnc-projects/java-library-base.svg?branch=master)](https://travis-ci.com/bnc-projects/java-library-base)
[![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=java-library-base&metric=alert_status)](https://sonarcloud.io/api/project_badges/measure?project=java-library-base&metric=alert_status)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=java-library-base&metric=coverage)](https://sonarcloud.io/api/project_badges/measure?project=java-library-base&metric=coverage)
[![Known Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=java-library-base&metric=vulnerabilities)](https://sonarcloud.io/api/project_badges/measure?project=java-library-base&metric=vulnerabilities)
# java-library-base

The base project for creating java libraries

## How tos

### Build & Test
```bash
./gradlew clean assemble check
```

### Publishing the library
The library is only published to BNC private maven repository when the build runs through Travis-CI.

## For more tasks run
```bash
./gradlew tasks
```
