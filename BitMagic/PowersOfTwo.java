package BitMagic;

import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        boolean result = isPowerOf2(num);
        System.out.printf("Is %d a power of 2? %s", num, result);
    }

    private static boolean isPowerOf2(int n) {
        if (n == 0)
            return false;
        n = n & (n-1);
        return n == 0;
    }
}
