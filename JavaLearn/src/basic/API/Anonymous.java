package basic.API;

/**
 * 匿名对象只能一次性使用
 */


import basic.JavaBean;

public class Anonymous {
    public static void main(String[] args) {
        JavaBean one = new JavaBean();
        one.setName("Lye");
        System.out.println("one 的 名字是:"+ one.getName());

        new JavaBean().setAge(20);
    }
}
