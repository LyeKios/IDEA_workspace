package org.example;

import java.util.Arrays;

public class A0数字字符串迭代和类型转换 {
    public int turnType(String n) {
        int res = 0;
        char[] strArr = n.toCharArray();
        System.out.println(Arrays.toString(strArr));
        for (int i = 0; i < strArr.length; i++) {
            int value = Integer.parseInt(String.valueOf(strArr[i]));
            res = (Math.max(value, res));
        }
        return res;
    }
}
