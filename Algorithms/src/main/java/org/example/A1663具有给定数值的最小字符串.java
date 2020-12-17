package org.example;

import java.util.Arrays;

public class A1663具有给定数值的最小字符串 {
    public String getSmallestString(int n, int k) {
        char[] minString = new char[n];
        Arrays.fill(minString, 'a');
        int m = n - 1;
        while (k >= m + 26) { // 还有m + 1 位没填，
            k -= 26;
            minString[m--] = 'z'; // 第m+1位填上z
        }
        if (m >= 0) { // >=0 说明不是z的倍数
            minString[m] = (char)('a' + k - (m + 1)); // [0...m]上填'a',等于k要消耗掉m+1， x = k - (m + 1)
        }
        return new String(minString);
    }
}
