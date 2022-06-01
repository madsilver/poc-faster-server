#!/bin/bash

set -e

NAME=default
HOST=http://localhost:8080

if [ -n "$1" ]
then
    NAME=$1
fi

ab -n 100000 -c 100 $HOST/healthcheck > $NAME.txt 2>&1  