package API;
//包路径.类名称
//java.lang包下的路径不需要导包
//导包-创建-使用

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   //system.in 代表从键盘输入

        int get = input.nextInt();

        System.out.println("get the input:" + get);

        String str = new Scanner(System.in).next();
        System.out.println("匿名方法得到的字符串是:"+ str);


    }
}
