package Mathematics;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the two numbers:\n");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int gcd = gcdEuclidOptimised(num1, num2);
            System.out.printf("GCD of %d and %d is %d%n", num1, num2, gcd);
        }

    }

    /**
     * GCD of two numbers using Naive approach.
     * @return int
     */
    public static int gcdNaive(int num1, int num2) {
        int min = Math.min(num1, num2);

        while (min > 0) {
            if (num1 % min == 0 && num2 % min == 0)
                break;
            min--;
        }
        return min;
    }

    /**
     * Implementation of GCD using Euclid Algorithm.
     * @return int
     */
    public static int gcdEuclid(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        return num1;
    }

    /**
     * Greatest Common Divisor of two numbers using Euclid Algorithm (Optimised).
     * @return int
     */
    public static int gcdEuclidOptimised(int num1, int num2) {
        if (num2 == 0)
            return num1;
        return gcdEuclidOptimised(num2, num1%num2);
    }

}
