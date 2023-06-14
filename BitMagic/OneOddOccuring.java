package BitMagic;

public class OneOddOccuring {
    public static void main(String[] args) {
        int[] arr = {4, 4, 7, 4, 8, 7, 7, 7, 4, 9, 8};
        int result = findOneOdd(arr);
        System.out.printf("The odd occuring element in the array is %d", result);
    }


    /*
     * Time Complexity: Theta(n)
     * Space Complexity: O(1)
     */
    private static int findOneOdd(int arr[]) {
        int res = arr[0];
        for(int i = 1; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        return res;
    }

    private static int findOneOddNaive(int[] arr) {
        int count;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            count = 0;
            for(int j = 0; j < len; j++) {
                if (arr[i]==arr[j])
                    count++;
            }
            if (count % 2 != 0)
                return arr[i];
        }
        return -1;
    }


 
}
