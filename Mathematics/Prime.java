package Mathematics;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        boolean isPrime = isPrimeOptimised(num);
        System.out.printf("Is %d a prime number? %s%n", num, isPrime);
    }

    /**
     * Optimised method to determine if a number is prime or not.
     * @param n - an integer number
     * @return boolean
     */
    private static boolean isPrimeOptimised(int n) {
        if (n==1)
            return false;
        if (n==2 || n==3)
            return true;
        if (n%2 == 0 || n%3 == 0)
            return false;
        for (int i = 5; i*i <= n; i = i+6)
            if ( n%i == 0 || n%(i+2) == 0)
                return false;
        return true;
    }

    /**
     * Method to check if a number is prime or not.
     * @param num - an integer number
     * @return boolean
     */
    private static boolean isPrime(int num) {
        if (num==1)
            return false;
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
