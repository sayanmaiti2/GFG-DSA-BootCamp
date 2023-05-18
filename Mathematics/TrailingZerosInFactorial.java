package Mathematics;

import java.util.Scanner;

public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            int trailingZeros = countTrailingZeros(num);
            System.out.println(String.format("Number of trailing 0's in %d! is: %d ", num, trailingZeros));
        }
    }

    public static int countTrailingZeros(int num) {
        int count = 0;
        for (int i = 5; i<=num; i=i*5) {
            count = count  + num/i;
        }
        return count;
    }
}
