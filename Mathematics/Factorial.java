package Mathematics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            long factorial = calculateFactorialRecursive(num);
            System.out.println(String.format("Factorial of %d is %d", num, factorial));
        }
    }

    static long calculateFactorial(int num) {
        long factorial = 1;
        for(int i = 2; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    static long calculateFactorialRecursive(int num) {
        if (num == 0) {
            return 1;
        }
        return num*calculateFactorialRecursive(num-1);
    }
}
