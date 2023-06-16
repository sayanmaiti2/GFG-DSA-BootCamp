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
