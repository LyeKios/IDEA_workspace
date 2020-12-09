package org.example;

class Solution {
    public static void main(String[] args) {
        boolean i = check(5);
        System.out.println(i);
        countPrimes(1);
    }
    public static void countPrimes(int n) {
        System.out.println("11111");
    }

    public static boolean check(int n){
        boolean t = Boolean.TRUE;
        for (int i = 2; i < n; i++)
            if (n % i == 0) t = false;
        return t;
    }
}