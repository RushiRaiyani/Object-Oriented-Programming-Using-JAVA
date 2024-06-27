/* Write a complete multi-threaded program to meet following 
requirements:
a. Read matrix [A] m x n
b. Create m number of threads
c. Each thread computes summation of elements of one row, i.e. 
ith row of the matrix is processed by ith thread. Where 0 <= 
i< m.
d. Print the results.
 */
package Multithreading;

import java.util.Scanner;
import java.util.Date;

class RowSummationThread extends Thread {
    private double[] row;
    private double sum;

    public RowSummationThread(double[] row) {
        this.row = row;
    }

    public double getSum() {
        return sum;
    }

    public void run() {
        sum = 0;
        for (double num : row) {
            sum += num;
        }
    }
}

public class Lab_9_3 {
    public static void main(String[] args) {
        Date ds = new Date();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int m = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int n = scanner.nextInt();

        double[][] matrix = new double[m][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        RowSummationThread[] threads = new RowSummationThread[m];
        for (int i = 0; i < m; i++) {
            threads[i] = new RowSummationThread(matrix[i]);
            threads[i].start();
        }

        try {
            for (RowSummationThread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum of each row:");
        for (int i = 0; i < m; i++) {
            System.out.println("Row " + (i + 1) + ": " + threads[i].getSum());
        }
        Date de = new Date();

        System.out.println("diif:" + (de.getTime() - ds.getTime()));
    }
}