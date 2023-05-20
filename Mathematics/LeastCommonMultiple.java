package Mathematics;

import java.util.Scanner;

class LeastCommonMultiple {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the two numbers:\n");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int lcm = getLcmOptimised(num1, num2);
            System.out.printf("LCM of %d and %d is %d%n", num1, num2, lcm);
        }
    }

    static int getLcmNaive(int num1, int num2) {
        int res = Math.max(num1, num1);
        while(true) {
            if (res % num1 == 0 && res % num2 == 0)
                break;
            else
                res++;
        }
        return res;
    }

    /*
     * Optimised method to calculate the LCM of two numbers.
     * Product of Two Numbers is LCM of two numbers multiplied with the GCD of those two numbers.
     * Therefore, LCM of the those two numbers is equal to Product of those two numbers divided by the GCD of those two numbers
     * We can use Euclid Algorithm to determine GCD of those two numbers in O(log(min(a,b)))
     */
    static int getLcmOptimised(int a, int b) {
        return (a*b)/getGCD(a,b);
    }

    /*
     * Method to calculate the GCD of two numbers using Euclid Algorithm
     */
    private static int getGCD(int a, int b) {
        if (b == 0)
            return a;
        return getGCD(b, a%b);
    }
}