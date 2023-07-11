#!/bin/bash

./gradlew build

docker build -t countingwords_api .

docker run -d -p 8080:8080 --name countingwords_container countingwords_api