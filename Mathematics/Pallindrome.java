package Mathematics;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            boolean isPallindrome = isPallindrome(num);
            System.out.println("Is Pallindrome? " + isPallindrome);
        }
    }

    static boolean isPallindrome(int num) {
        if (num < 0)
            return false;
        int mirrorNum = 0;
        int digit = 0;
        int numCopy = num;
        while(num > 0) {
            digit = num%10;
            mirrorNum = mirrorNum * 10 + digit;
            num = num/10;
        }
        return (numCopy == mirrorNum);
    }
}
