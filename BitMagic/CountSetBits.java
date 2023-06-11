package BitMagic;

import java.util.Scanner;

public class CountSetBits {
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            int result = countSetBitsTrial(num);
            System.out.printf("The number of set bits in %d is %d", num, result);
        }
    }

    /*
     * Count the set bits in a number iterativly.
     * Here, we right-shift the number by one-bit and check we perform AND operation between the resulting number and 1.
     * If the result of the AND operation is not zero, then we increment the count by 1.
     */
    private static int countSetBitsNaive(int n) {
        if (n == 0)
            return 0;
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1)
                count++;
            n = n >> 1;
        }
        return count;
    }

    private static int countSetBitsWithBrianKerningumAlgorithm(int n) {
        if (n == 0)
            return 0;
        int count = 0;
        while (n > 0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }

    private static int countSetBitsWithLookupTable(int n) {
        int[] table = new int[256];
        initializeTable(table);
        return table[n & 255] + table[(n >> 8) & 255] + table[(n >> 16) & 255] + table[(n >> 24)];
    }

    private static void initializeTable(int[] table) {
        table[0] = 0;
        for (int i = 1; i < 255; i++) {
            table[i] = table[i & (i-1)] + 1;
        }
    }

}
