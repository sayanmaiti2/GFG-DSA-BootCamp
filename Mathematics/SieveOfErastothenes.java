package Mathematics;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Seive of Erasthothenes is an algorithm through which we can determine all the prime numbers less than or equal to n.
 * At first, we initialise an array of length n+1 with TRUE with n being the input number.
 * Then, we loop through the 2 to n and mark all the factors of these numbers as FALSE in the array.
 * At last, we print the indices of the array where the value is still TRUE
 */
class SieveOfErastothenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.printf("The Prime numbers till %d are:\n", num);
        printSieve(num);
    }


    private static void printSieveOptimised(int n) {
        boolean[] primeArr = new boolean[n+1];
        Arrays.fill(primeArr, true);
        for (int i = 2; i <= n; i++) {
            if(isPrime(i)) {
                System.out.println(i);
                for(int j = i * i; j <=n; j = j+1) {
                    primeArr[j] = false;
                }
            }
        }
    }

    private static void printSieve(int n) {

        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        for(int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = 2*i; j <= n; j=j+i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(isPrime[i] == true)
                System.out.println(i);
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i++) {
            if (n % i == 0 || n % (i+2) == 0)
                return false;
        }
        return true;
    }

    
}