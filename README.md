# Random Number Generator and Descriptive Statistics

## Author
Riad Baghishov

## Course
Object Oriented Analysis and Design

## Assignment Description
This assignment requires the implementation of a Java program that generates
random double values in the range **[0, 1)** using different built-in Java random
number generators and analyzes the generated data using descriptive statistics.

The goal is to observe how statistical measures change as the sample size
increases and compare different random number generation approaches provided by
the Java standard library.

---

## Random Number Generators Used
The program uses the following Java random number generators:

- `java.util.Random`
- `Math.random()`
- `java.util.concurrent.ThreadLocalRandom`

---

## Statistical Measures Calculated
For each generated dataset, the program calculates:

- Number of elements (n)
- Mean
- Sample standard deviation
- Minimum value
- Maximum value

As the sample size increases:
- Minimum approaches 0
- Maximum approaches 1
- Mean approaches 0.5
- Sample standard deviation approaches approximately 0.29

Small deviations are expected for smaller sample sizes.

---

## Program Requirements Satisfied
- Single Java class named `Generator`
- Generates random values in `[0, 1)`
- Uses multiple random number generators
- Computes descriptive statistics
- Displays results in tabular format
- Produces **nine total results**
- Minimal `main` method
- Beginner-friendly Java implementation
- Clear comments explaining object-oriented concepts

---

## Object-Oriented Concepts Demonstrated
The source code explicitly highlights the following concepts using comments:

- Class definition
- Method definition
- Class attributes
- Object instantiation
- Accessibility (`public`)
