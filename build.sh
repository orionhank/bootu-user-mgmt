#!/usr/bin/env bash
mvn clean package -U -Dmaven.test.skip=true
docker build -t orionhank/bootu-user:latest .
docker push orionhank/bootu-user:latest