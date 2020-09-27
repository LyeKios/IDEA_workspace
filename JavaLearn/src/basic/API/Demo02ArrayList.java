package basic.API;

import java.util.ArrayList;

/**
 * ArrayList<E> <E>代表泛型
 * 泛型只能是引用类型，不能是基本类型 如String
 * PS: 对于ArrayList集合，打印出来不是地址而是经过了toString的内容
 *
 * list.add(E value)
 * list.get(int index)
 * list.remove(int index)
 * list.size()
 *
 * 基本类型-包装类
 * byte    Byte
 * short   Short
 * int     Integer
 * long    Long
 * float   Float
 * double  Double
 * char    Character
 * boolean Boolean
 *
 */

public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("54");

        System.out.println(list.size());

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(7);
        list1.add(4);

        System.out.println(list1);
    }
}
