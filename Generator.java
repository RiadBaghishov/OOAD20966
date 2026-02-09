/*
 * Name: Riad Baghishov
 * Project: Random Number Generator and Statistics
 * Class: Object Oriented Analysis and Design
 * Date: 09 February 2026
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
 * ============================
 * CLASS DEFINITION
 * ============================
 * This class generates random numbers using different
 * Java random number generators and calculates statistics.
 */
public class Generator {

    /*
     * ============================
     * CLASS ATTRIBUTE
     * ============================
     * Constants to identify which random number generator to use
     */
    public static final int JAVA_UTIL_RANDOM = 1;
    public static final int MATH_RANDOM = 2;
    public static final int THREAD_LOCAL_RANDOM = 3;

    /*
     * ============================
     * METHOD DEFINITION
     * ============================
     * Creates and returns an ArrayList of n random numbers
     * using the selected random number generator.
     *
     * Accessibility: public
     */
    public ArrayList<Double> populate(int n, int randNumGen) {

        ArrayList<Double> values = new ArrayList<Double>();

        // Object instantiation example
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            double num = 0.0;

            if (randNumGen == JAVA_UTIL_RANDOM) {
                num = rand.nextDouble();
            } else if (randNumGen == MATH_RANDOM) {
                num = Math.random();
            } else if (randNumGen == THREAD_LOCAL_RANDOM) {
                num = ThreadLocalRandom.current().nextDouble();
            }

            values.add(num);
        }

        return values;
    }

    /*
     * Calculates descriptive statistics:
     * n, mean, sample standard deviation, min, max
     *
     * Returns results in this order:
     * [n, mean, stddev, min, max]
     */
    public ArrayList<Double> statistics(ArrayList<Double> randomValues) {

        ArrayList<Double> results = new ArrayList<Double>();

        int n = randomValues.size();
        double sum = 0.0;
        double min = randomValues.get(0);
        double max = randomValues.get(0);

        for (double value : randomValues) {
            sum += value;

            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        double mean = sum / n;

        double varianceSum = 0.0;
        for (double value : randomValues) {
            varianceSum += Math.pow(value - mean, 2);
        }

        // Sample standard deviation
        double stddev = Math.sqrt(varianceSum / (n - 1));

        results.add((double) n);
        results.add(mean);
        results.add(stddev);
        results.add(min);
        results.add(max);

        return results;
    }

    /*
     * Displays the results in a table format.
     * Header can be turned on or off.
     */
    public void display(ArrayList<Double> results, boolean headerOn) {

        if (headerOn) {
            System.out.printf("%-10s %-10s %-10s %-10s %-10s%n",
                    "n", "Mean", "StdDev", "Min", "Max");
            System.out.println("----------------------------------------------------");
        }

        System.out.printf("%-10.0f %-10.4f %-10.4f %-10.4f %-10.4f%n",
                results.get(0),
                results.get(1),
                results.get(2),
                results.get(3),
                results.get(4));
    }

    /*
     * Calls populate, statistics, and display methods
     * for all combinations of n values and generators.
     * Produces a total of 9 results.
     */
    public void execute() {

        int[] sampleSizes = {10, 100, 1000};
        int[] generators = {
                JAVA_UTIL_RANDOM,
                MATH_RANDOM,
                THREAD_LOCAL_RANDOM
        };

        for (int gen : generators) {
            System.out.println("\nRandom Generator Type: " + gen);

            boolean headerPrinted = false;

            for (int n : sampleSizes) {
                ArrayList<Double> values = populate(n, gen);
                ArrayList<Double> stats = statistics(values);

                display(stats, !headerPrinted);
                headerPrinted = true;
            }
        }
    }

    public static void main(String[] args) {

        // Object instantiation
        Generator g = new Generator();

        g.execute();
    }
}