package basic;

import java.util.Scanner;

public class AutoCoding {
    public static void main(String[] args) {
        System.out.println("Hello,world");
        for (int i = 0; i < 5; i++) {
            System.out.println("*");
        }
        System.out.println(printChar(1, 2));
        System.out.println(Max(2,4));
    }

    public static boolean printChar(int a, int b) {
        return a==b;
    }

    public static int Max(int a, int b) {
        return a>=b?a:b;
    }

}
