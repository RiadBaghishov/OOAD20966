# Random Number Generator and Statistics

## Author
Riad Baghishov

## Course
Object Oriented Analysis and Design

## Description
This Java program generates random double values in the range [0, 1)
using three different built-in Java random number generators:

- java.util.Random
- Math.random()
- java.util.concurrent.ThreadLocalRandom

For different sample sizes, the program calculates descriptive statistics
including:
- Number of elements (n)
- Mean
- Sample standard deviation
- Minimum
- Maximum

The results are displayed in a tabular format in the console.

## Program Structure
The program consists of a single Java class named `Generator` with the
following methods:

- `populate(int n, int randNumGen)`
- `statistics(ArrayList<Double> randomValues)`
- `display(ArrayList<Double> results, boolean headerOn)`
- `execute()`

The `main` method only creates an instance of the `Generator` class
and calls the `execute()` method, as required.

## How to Run
1. Compile the program:

