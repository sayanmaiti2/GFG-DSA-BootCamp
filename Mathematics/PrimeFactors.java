package Mathematics;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.printf("The prime factors of %d are:\n", num);
        printPrimeFactors(num);
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

     /**
     * A method that calculates and prints the prime factors of a given number.
     * It explicitly checks for divisibility by 2 and 3 to reduce multiple iterations.
     * It has a time complexity of Theta(Sqaure root of n)
     * @param n an integer number
     */
    private static void printPrimeFactors(int n) {
        if (n <= 1)
            return;
        while (n % 2 == 0) {
            System.out.print(2 + "\t");
            n = n/2;
        }
        while (n % 3 == 0) {
            System.out.print(3 + "\t");
            n = n/3;
        }
        for (int i = 5; i*i <= n; i=i+6) {
            while (n % i == 0) {
                System.out.print(i + "\t");
                n = n/i;
            }
            while ( n % (i+2) == 0) {
                System.out.print((i+2) + "\t");
                n = n/(i+2); 
            }
        }
        if (n > 3) {
            System.out.print(n);
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
