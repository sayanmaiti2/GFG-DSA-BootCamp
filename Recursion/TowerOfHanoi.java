package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks:");
        Integer num = sc.nextInt();
        towerOfHanoi(num, "A", "B", "C");
    }

    public static void towerOfHanoi(int n, String src, String aux, String dest) {
        if (n == 1) {
            System.out.printf("Move Disk 1 from %s to %s \n", src, dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, aux);
        System.out.printf("Move Disk %d from %s to %s \n", n, src, dest);
        towerOfHanoi(n-1, aux, src, dest);
    }
}
