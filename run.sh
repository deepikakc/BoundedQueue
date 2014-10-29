#!/bin/bash

cd ./src/

COMPILE="javac"
FLAGS="-cp"
JARS=".:../junit-4.11.jar:../hamcrest-core-1.3.jar"

EXECUTE="java"
RUNNER="org.junit.runner.JUnitCore"

echo "Compiling BoundedQueue java source files ... "
$COMPILE BoundedQueue.java QueueEmptyException.java QueueFullException.java
echo "Compiling source files complete"

echo "Compiling JUnit Tests ... "
$COMPILE $FLAGS $JARS BoundedQueueTest.java 
echo "Compiling JUnit Tests complete"

echo "Running Tests ... "
$EXECUTE $FLAGS $JARS $RUNNER BoundedQueueTest

