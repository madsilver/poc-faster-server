#!/bin/bash

set -e

NAME=default
HOST=http://localhost:8080

if [ -n "$1" ]
then
    NAME=$1
fi

wrk -t100 -c100 $HOST/healthcheck > $NAME.txt 2>&1