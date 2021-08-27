#!/usr/bin/env bash
docker build -t user-edge-service:latest .
#mvn clean package

#docker build -t hub.mooc.com:8080/micro-service/user-edge-service:latest .
#docker push hub.mooc.com:8080/micro-service/user-edge-service:latest