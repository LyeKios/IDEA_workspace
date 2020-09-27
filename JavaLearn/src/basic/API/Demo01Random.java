package basic.API;

import java.util.Random;
import java.util.Scanner;

/**
 * 生成随机数字
 * 默认范围是所有INT
 * 左闭右开区（包括0，即 [0, int)  )
 */

public class Demo01Random {
    public static void main(String[] args) {
        Random ran = new Random();
        int num = ran.nextInt(10);
        System.out.println("随机数是:"+num);

        int start = new Scanner(System.in).nextInt();
        int stop = new Scanner(System.in).nextInt();

        for (int i = 0; i < 20; i++) {
            System.out.println("区间随机数[" + start + ", " + stop + "):"+ randomRange(start, stop));
        }
    }

    public static int randomRange(int start, int stop){
        Random r = new Random();
        int stride = r.nextInt(stop - start);
        return stride + start;
    }
}
