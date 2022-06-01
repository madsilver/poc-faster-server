#!/bin/bash

set -e

MASTER_PORT=5557
MASTER_IP=127.0.0.1
USERS=100
SPAWN=100
CORES=8
SERVER_HOST=http://127.0.0.1:8080
RUN_TIME=20s
NAME=default

if [ -n "$1" ]
then
    NAME=$1
fi

echo -e "\nStart Master\n"
locust -f locustfile.py --headless -t $RUN_TIME --master-bind-port=$MASTER_PORT --master-bind-host=$MASTER_IP -u $USERS -r $SPAWN --only-summary --master --expect-workers=$CORES --csv $NAME --host=$SERVER_HOST&

PID_MASTER=$!
echo "Master PID = $PID_MASTER"

sleep 5

# start SLAVE (clients)
echo -e "\nStart SLAVES\n"
PID_SLAVES=( )

for ((i = 1; i <= $CORES; i++));do
  locust -f locustfile.py --worker --master-host=$MASTER_IP --master-port=$MASTER_PORT &
  PID_SLAVES+=( $! )
done

echo Slave PIDs = ${PID_SLAVES[@]}"
