BoundedQueue for KPCB Fellows Application
============

Problem Description: 
Using only primitive types, implement a bounded queue to store integers. The data structure should be optimized for algorithmic runtime, memory usage, and memory throughput. No external libraries should be imported and/or used. The solution should be delivered in one class that provides the following functions:

 * constructor: class should provide one method for object creation that takes an integer to set the size of the queue.

 * enqueue: function should take an integer and store it in the queue if the queue isn't full. The function should properly handle the case where the queue is already full.
 
 * dequeue: function should return an integer if one is currently stored in the queue. The function should properly handle the case where the queue is empty.


Running Local Tests
------
In the application root directory, type

```bash
./run.sh
```

or compile in the /src directory with

```bash
javac BoundedQueue.java QueueEmptyException.java QueueFullException.java
```

```bash
javac -cp .:../junit-4.11.jar:../hamcrest-core-1.3.jar BoundedQueueTest.java
```

```bash
java -cp .:../junit-4.11.jar:../hamcrest-core-1.3.jar org.junit.runner.JUnitCore BoundedQueueTest.java
```

Running Custom Tests
------
All *.java files are located in /src

Source Files
* BoundedQueue.java - Class definition for the BoundedQueue data structure 
* QueueEmptyException.java - Used for catching dequeue
* QueueFullException.java - Used for catching enqueue

Unit Test
* BoundedQueueTest.java - JUnit Tests


Add custom JUnit tests to BoundedQueueTest.java and re-run compilitation from the above section.