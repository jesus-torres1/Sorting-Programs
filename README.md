# TorresJ06
Project requisite for CSC6301 Software Design &amp; Documentation

# Sorting Programs in Java
This repository contains two Java programs for sorting a list of integer numbers from the user's input. 
One program uses a LinkedList, and the other uses a Stack data structure to achieve the same goal.

# Prerequisite
- Please make sure you download and install java
- Example:
  $ java -version
  java version "17.0.8" 2023-07-18 LTS

# How to run the program
- To compile the program
  javac SortLinkedList.java
  javac SortedStack.java

- To run the program
  java SortLinkedList
  java SortedStack

- To generate javadoc
  javadoc -author -version -d doc SortLinkedList.java
  javadoc -author -version -d doc SortedStack.java

- To load javadoc page
  Within doc directory path, click on SortLinkedList.htlm
  Within doc directory path, click on SortedStack.htlm
  
# How to use the SortLinkedList program
- To use SortLinkedList follow the on-screen instructions to enter a list of integers.
  To exit the program, enter a non-integer value.
- Example:
  Enter an integer (or a non-integer value to exit): 5
  Enter an integer (or a non-integer value to exit): 2
  Enter an integer (or a non-integer value to exit): 8
  Enter an integer (or a non-integer value to exit): 1
  Enter an integer (or a non-integer value to exit): x
  Sorted List:
  1
  2
  5
  8

# How to use the SortedStack program
- To use SortedStack follow the on-screen instructions to enter a list of integers.
  To exit the program, enter a non-integer value.
- Example:
  Enter an integer (or a non-integer value to exit): 6
  Enter an integer (or a non-integer value to exit): 3
  Enter an integer (or a non-integer value to exit): 9
  Enter an integer (or a non-integer value to exit): 2
  Enter an integer (or a non-integer value to exit): x
  Sorted Stack (from smallest to largest):
  2
  3
  6
  9
