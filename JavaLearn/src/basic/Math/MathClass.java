package basic.Math;

/**
 * static double abs(double num): 获取绝对值
 * static double ceil(double num): 向上取整
 * static double floor(double num): 向下取整
 * static long round(double num): 四舍五入
 *
 * Math.PI
 *
 */

public class MathClass {
    public static void main(String[] args) {
        double start = -10.8;
        double stop = 5.9;
        double abs1 = 6.0;
        double abs2 = 2.1;

        int count = 0;

        for (double i = Math.ceil(start); i < Math.ceil(stop); i++) {
            if ((Math.abs(i) < Math.abs(abs2)) || (Math.abs(i) > Math.abs(abs1))){
                count ++;
            }
        }
        System.out.println("共有"+ count + "个");
    }


}
