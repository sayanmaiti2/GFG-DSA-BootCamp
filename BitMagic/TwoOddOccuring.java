package BitMagic;

public class TwoOddOccuring {
    public static void main(String[] args) {
        int[] arr = {5, 6, 10, 6, 10, 6, 3, 3};
        int result[] = findTwoOdd(arr);
        System.out.println("The Two odd occuring numbers are: ");
        for (int val : result) {
            System.out.println(val);
        }
    }

    private static int[] findTwoOdd(int[] arr) {
        int[] result = new int[2];
        int temp = arr[0];
        int i;
        for (i = 1 ; i < arr.length; i++) {
           temp = temp ^ arr[i]; 
        }
        System.out.printf("Initial XOR Result: %d", temp);
        int k = temp & (~ (temp - 1));
        System.out.printf("k: %d", k);

        int res1 = 0, res2 = 0;
        for(i = 0; i < arr.length; i++) {
            if ((arr[i] & k) != 0) 
                res1 = res1 ^ arr[i];
            else
                res2 = res2 ^ arr[i];
        }
        result[0] = res1;
        result[1] = res2;
        return result;
    }

    


}
