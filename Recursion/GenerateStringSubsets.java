package Recursion;

import java.util.Scanner;

public class GenerateStringSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.next();
        System.out.printf("Subsets of %s is \n", str);
        // generateStringSubsets("", 0, str);
        generateSubsets(str);
    }

    public static void generateStringSubsets(String current, int i, String str) {
        if(i == str.length()) {
            System.out.println(current);
             return;
        }
        generateStringSubsets(current , i+1, str);
        generateStringSubsets(current + str.charAt(i) , i+1, str);
    }

    public static void generateSubsets(String str) {
        int n = 1 << str.length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < str.length(); j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println("");
        }
    }

    public static generateSubsetIterative
}
