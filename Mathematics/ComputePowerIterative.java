package Mathematics;

import java.util.Scanner;

public class ComputePowerIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Enter the exponent:");
        int pow = sc.nextInt();
        long result = powerIterative(num, pow);
        System.out.println("The result is " + result);
    }


    /*
     * Converts the exponent into a binary number and calculate power accordingly.
     * The time complexity is O(log n) and the auxiliary space is O(1). 
     * Therefore, this implementation is better than recursive solution.
     */
    private static long powerIterative(int x, int n) {
        int res = 1;
        while ( n > 0) {
            if ((n % 2) != 0) {
                res = res * x;
            }
            n = n / 2;
            x = x * x;
        }
        return res;
    }
}
