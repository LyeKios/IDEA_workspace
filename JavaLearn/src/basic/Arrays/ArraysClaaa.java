package basic.Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

/**
 * 一个数组相关的工具类，里面提供了大量静态方法，可用来实现数组的常见操作
 *
 * static String toString(Array): 将参数数组转化为字符串，默认格式[item1, item2, item3.....]
 * static void sort(Array):    数字、字母升序， 自定义类需要有Comparable或者Comparator接口的支持
 *
 *
 */

public class ArraysClaaa {
    public static void main(String[] args) {
        int[] array = {1, 6, 3, 10, 22, 5, 4, 33, 1, 9};

        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }

}
