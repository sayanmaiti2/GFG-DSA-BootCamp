package BitMagic;

import java.util.Scanner;

public class CheckKthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Enter the bit to be checked:");
        int k = sc.nextInt();
        boolean result = isKthBitSetRightShift(num, k);
        System.out.println("The result is " + result);
    }

    private static boolean isKthBitSetNaive(int n, int k) {
        int x = 1;
        for (int i = 1; i <= (k-1); i++) {
            x = x * 2;
        }
        if ((n & x) == 0)
            return false;
        return true;
    }

    private static boolean isKthBitSetLeftShift(int n, int k) {
        int x = 1 << (k-1);
        if ((n & x) == 0)
            return false;
        return true;
    }

    private static boolean isKthBitSetRightShift(int n, int k) {
        int x = 1 << (k-1);
        if ((n & x) == 0)
            return false;
        return true;
    }

}
