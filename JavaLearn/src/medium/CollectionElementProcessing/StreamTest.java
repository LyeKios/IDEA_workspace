package medium.CollectionElementProcessing;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> oneNew = new ArrayList<>();
        oneNew.add("迪丽热巴");
        oneNew.add("宋远桥");
        oneNew.add("苏星河");
        oneNew.add("石破天");
        oneNew.add("始终与");
        oneNew.add("老子");
        oneNew.add("庄子");
        oneNew.add("洪七公");
//        1、第一个队伍只要名字为三个字的成员姓名，存储到一个新集合中
//        2、第一个队伍筛选后只要前三个人，存储到一个新集合中
        Stream<String> oneStream = oneNew.stream().filter(name -> name.length() == 3).limit(3);

        ArrayList<String> twoNew = new ArrayList<>();
        twoNew.add("古力娜扎");
        twoNew.add("张无忌");
        twoNew.add("易烊千玺");
        twoNew.add("赵丽颖");
        twoNew.add("张三丰");
        twoNew.add("尼古拉斯赵四");
        twoNew.add("张爱天");
        twoNew.add("张二狗");

        Stream<String> twoStream = twoNew.stream().filter(name->name.startsWith("张")).skip(2);

        Stream.concat(oneStream, twoStream).map(Person::new).forEach(System.out::println);
    }
}
