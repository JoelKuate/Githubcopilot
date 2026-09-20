#!/bin/sh
# TaskFlow - compilation et execution, avec le JDK seul.
#   ./run.sh            liste les demandes
#   ./run.sh tests      lance la suite de tests
#   ./run.sh fiche DEM-2026-0112
set -e
mkdir -p out
javac -encoding UTF-8 -d out $(find src -name "*.java")
if [ "$1" = "tests" ]; then
  java -cp out taskflow.TestRunner
else
  java -cp out taskflow.TaskFlowApp "$@"
fi
