#!/bin/bash

locust -f locustfile.py --host http://localhost:8080 --headless -u 100 -r 100 --run-time 10s
