package medium.Iterator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合中方法iterator()获取迭代器的实现对象，使用Iterator接口接收（多态）
 * Iterator.hasNext判断是否还有下一个元素
 * Iterator.next取出下一个元素
 *
 * 迭代器的泛型与集合一致
 */

public class Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        //add item
        coll.add("Lye");
        coll.add("Kios");
        coll.add("Lye1");
        coll.add("Kios1");

        java.util.Iterator<String> iter = coll.iterator();

        boolean b = iter.hasNext();
        System.out.println(b);
        while (b){
            String next = iter.next();
            System.out.println(next);
            b = iter.hasNext();
        }




    }

}
