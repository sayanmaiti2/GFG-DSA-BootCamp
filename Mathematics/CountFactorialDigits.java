package Mathematics;

import java.util.Scanner;

public class CountFactorialDigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            int digits = digitsInFactorial(num);
            System.out.println(String.format("Number of digits in %d! is: %d ", num, digits));
        }
    }

    public static int digitsInFactorial(int N){
        // code here
        double res = 0;
        for (int i = 2; i<=N; i++) {
            res += Math.log10(i);
        }
        return (int) Math.floor(res) + 1;
    }

}
