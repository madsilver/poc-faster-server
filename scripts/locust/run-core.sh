#!/bin/bash

set -e

MASTER_PORT=5557
MASTER_IP=127.0.0.1
USERS=1000
SPAWN=10
CORES=8
SERVER_HOST=http://127.0.0.1:8080
RUN_TIME=40s
CSV_NAME=default

if [ -n "$1" ]; then
    CSV_NAME=$1
fi

master() {
  locust -f locustfile.py --headless -t $RUN_TIME --master-bind-port=$MASTER_PORT --master-bind-host=$MASTER_IP -u $USERS -r $SPAWN --only-summary --master --expect-workers=$CORES --csv $CSV_NAME --host=$SERVER_HOST&
  echo "Master PID = $!"
  sleep 5
}

slaves() {
  pids=( )

  for ((i = 1; i <= $CORES; i++)); do
    locust -f locustfile.py --worker --master-host=$MASTER_IP --master-port=$MASTER_PORT &
    pids+=( $! )
  done

  echo "Slave PIDs = ${pids[@]}"
}

echo -e "\nStart Master\n"
master

echo -e "\nStart Slaves\n"
slaves
