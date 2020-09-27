package basic.StringClass;

/**
 * 1、字符串是常量 一旦定义不可改变
 * 2、字符串不可改变，所以可以共享使用
 * 3、效果上相当于char[] list  底层原理是byte[]字节数组
 *
 * 注意: 直接双引号赋值的字符串变量存放在字符串常量池中
 *
 * 对于基本类型， == 进行的是数值的比较
 * 对于引用类型， == 进行的是地址值的比较    equals
 * 一般将常量字符串放在前面 “str”.equals(str1)
 * equalsIgnoreCase()忽略大小写
 *
 * 常用方法
 * int length()
 * String concat(String str): 拼接
 * char charAt(int index): 获取索引位置的字符
 * int indexOf(String str): 查找参数字符串首次出现的索引位置，找不到就返回-1
 * str  substring(int index)
 * str substring(int start, int end)    [start, end)
 *
 * String 转换方法:
 * char[] toCharArray()  转换成字符数组
 * byte[] getBytes()    转换成字符串底层字节数组
 * String replace(CharSequence oidString, CharSequence newString)   所有对应字符串替换
 *
 * 字符串的切割 Split
 *
 *  String[] split(String regex)    以“regex”的值为分割，返回String[]
 *  PS 注意事项: regex是一个正则表达式，以英文句号为分割时，写法为“//.”
 *
 *
 */

public class Note {
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        System.out.println(str1.equals(str3));

    }

}
