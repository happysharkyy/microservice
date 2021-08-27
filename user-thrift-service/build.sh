#!/usr/bin/env bash
docker build -t user-thrift-service:latest .
#mvn clean package

#docker build -t hub.mooc.com:8080/micro-service/user-thrift-service:latest .
#docker push hub.mooc.com:8080/micro-service/user-service:latest