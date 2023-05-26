package Mathematics;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.printf("The Divisors of %d are:\n", num);
        printDivisors(num);
    }

    /**
     * A method that prints all the divisors of a number in sorted order.
     * It has two loops that that traverses in Big O of Square-root of n.
     * The first loop prints all the divisors from 1 (inclusive) until Square root of n (exclusive).
     * The second loop prints all the divisors from Square root of n (inclusive) to n (inclusive).
     * @param n integer number
     */
    private static void printDivisors(int n) {
        System.out.println(1);
        int i;
        for (i = 1; i * i < n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
        if (i - (n/i) == 1)
            i--;
        for (; i >=1; i--)
            if (n % i == 0)
                System.out.println(n/i);
    }
}
