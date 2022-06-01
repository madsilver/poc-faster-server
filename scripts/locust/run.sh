#!/bin/bash

set -e

USERS=100
SPAWN=3
TIME=60s

echo -e "Users: $USERS, Spawn: $SPAWN, Time: $TIME\n"

locust -f locustfile.py --host http://localhost:8080 --headless -u $USERS -r $SPAWN --run-time $TIME
