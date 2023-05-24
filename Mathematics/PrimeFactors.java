package Mathematics;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.printf("The prime factors of %d are:\n", num);
        printPrimeFactorsOptimised(num);
    }

    /**
     * A method that calculates and prints the prime factors of a given number
     * It has a time complexity of O(n * log n)
     * @param n an integer number
     */
    private static void printPrimeFactorsNaive(int n) {
        for(int i = 2; i < n; i++) {
            if (isPrime(i)) {
                int x = i;
                while ( n % x == 0) {
                    System.out.print(i + "\t");
                    x = x * i;
                }
            }
        }
    }

    private static void printPrimeFactorsOptimised(int n) {
        if (n <= 1) return;
        for (int i = 2; i*i <= n; i++) {
                while (n % i == 0) {
                    System.out.print(i + "\t");
                    n = n / i;
                }
        }
        if (n > 1)
            System.out.print(n);
    }

    /**
     * Method to check if a number is prime or not
     * @param n integer number
     * @return boolean
     */
    private static boolean isPrime(int n) {
        if (n == 1)
            return false;
        if (n==2 || n==3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i*i <= n; i = i + 6) {
            if (n % i == 0 || n % (i+2) == 0)
                return false;
        }
        return true;
    }
}
