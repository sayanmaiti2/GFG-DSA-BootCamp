package Mathematics;

import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            int digits = digitCounter(num);
            System.out.println("Number of digits: " + digits);
        }
    }

    static int digitCounter(int num) {
        int digits = 0;
        while (num > 0) {
            num = num/10;
            digits++;
        }
        return digits;
    }
}