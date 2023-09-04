package BitMagic;

public class MaximumAND {
    public static void main(String[] args) {
        int[] arr = {18, 15, 13, 12};
        int maxAND = calculcateMaximumANDNaive(arr, arr.length);
        System.out.printf("Maximum AND value NAIVE: %d \n", maxAND);
        maxAND = maxAND(arr, arr.length);
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

    // Utility function to check number of elements
    // having set msb as of pattern
    static int checkBit(int pattern, int arr[], int n)
    {
        int count = 0;
        for (int i = 0; i < n; i++)
            if ((pattern & arr[i]) == pattern)
                count++;
        return count;
    }

    // Function for finding maximum and value pair
    static int maxAND(int arr[], int n)
    {
        int res = 0, count;

        // iterate over total of 32bits
        // from msb to lsb
        for (int bit = 31; bit >= 0; bit--) {
            // find the count of element
            // having set msb
            count = checkBit(res | (1 << bit), arr, n);

            // if count >= 2 set particular
            // bit in result
            if (count >= 2)
                res |= (1 << bit);
        }

        return res;
    }


}