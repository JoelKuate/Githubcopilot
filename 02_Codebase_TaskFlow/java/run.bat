@echo off
REM TaskFlow - compilation et execution, avec le JDK seul.
REM   run.bat            liste les demandes
REM   run.bat tests      lance la suite de tests
REM   run.bat fiche DEM-2026-0112
if not exist out mkdir out
dir /s /b src\*.java > sources.txt
javac -encoding UTF-8 -d out @sources.txt
del sources.txt
if "%1"=="tests" (
  java -cp out taskflow.TestRunner
) else (
  java -cp out taskflow.TaskFlowApp %*
)
