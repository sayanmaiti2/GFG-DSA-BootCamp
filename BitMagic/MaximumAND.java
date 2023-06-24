package BitMagic;

public class MaximumAND {
    public static void main(String[] args) {
        int[] arr = {16, 12, 8, 4};
        int maxAND = calculcateMaximumANDNaive(arr, arr.length);
        System.out.printf("Maximum AND value NAIVE: %d \n", maxAND);
        maxAND = calculcateMaximumAND(arr, arr.length);
        System.out.printf("Maximum AND value OPTIMISED: %d", maxAND);
    }

    private static int calculcateMaximumANDNaive(int[] arr, int n) {
        int max = 0;
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                max = Math.max(max, arr[i] & arr[j]);
            }
        }
        return max;
    }

    private static int calculcateMaximumAND(int[] arr, int n) {
        int res = 0;
        int count;
        for(int bit = 4; bit >= 0; bit--) {
            count = 0;
            count = countSetBit((res | 1 << bit), arr, n);
            if (count >= 2) {
                res = res | (1 << bit);
            }
        }
        return res;
    }

    private static int countSetBit(int pattern, int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if ((pattern & arr[i]) == pattern) {
                count++;
            }
        }
        return count;
    }

}