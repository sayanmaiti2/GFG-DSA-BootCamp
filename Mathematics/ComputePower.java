package Mathematics;

import java.util.Scanner;

public class ComputePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Enter the exponent:");
        int pow = sc.nextInt();
        long result = power(num, pow);
        System.out.println("The result is " + result);
    }

    /*
     * Optimised solution to compute power of a number.
     * Take theta(log n) time and theta(log n) auxiliary space and additional function call overhead
     */
    private static long power(int x, int n) {
        if (n == 0)
            return 1;
        long temp = power(x, n/2);
        if (n % 2 == 0)
            return temp * temp;
        else
            return temp * temp * x;
    }

    /*
     * Naive solution to compute power of a number.
     * Takes theta(n) time
     */
    private static long powerNaive(int x, int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result = result * x;
        }
        return result;
    }

}
