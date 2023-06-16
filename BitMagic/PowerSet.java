package BitMagic;

import java.util.Scanner;

public class PowerSet {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.next();
        System.out.printf("Powerset of %s is \n", str);
        printPowerSet(str);
    }

    /*
     * Method to print the powerset of a String using Bitwise operators.
     * It iterates to the length of the string and checks if the bit in the particular position is set or not.
     * Time Complexity: O(n * 2 ^ n)
     * Auxiliary Space: O(1)
     */
    private static void printPowerSet(String inputStr) {
        int lenOfStr = inputStr.length();
        int powerSetSize = 1 << lenOfStr;
        for (int i = 0; i < powerSetSize; i++) {
             for (int j = 0; j < lenOfStr; j++) {
                if ((i & (1 << j)) != 0)
                    System.out.print(inputStr.charAt(j));
            }
        System.out.println("");
        }
    }
}
