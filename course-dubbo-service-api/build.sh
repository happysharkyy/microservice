#!/usr/bin/env bash

#mvn clean package
docker build -t course-dubbo-service:latest .
#docker build -t hub.mooc.com:8080/micro-service/user-service:latest .
#docker push hub.mooc.com:8080/micro-service/user-service:latest