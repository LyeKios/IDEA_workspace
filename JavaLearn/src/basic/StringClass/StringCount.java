package basic.StringClass;

import java.util.Scanner;

/**
 * get an input array, and count the times of every alphabet-Class appear  大小写、数字、其他
 */

public class StringCount {
    public static void main(String[] args) {
        System.out.print("请输入字符串：");
        String inputString = new Scanner(System.in).next();
        char[] inputArray = inputString.toCharArray();

        int upperNum = 0;
        int lowerNum = 0;
        int numberNum = 0;
        int otherNum = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] >= 'A' && inputArray[i] <= 'Z'){
                upperNum += 1;
            }else if (inputArray[i] >= 'a' && inputArray[i] <= 'z'){
                lowerNum += 1;
            }else if (inputArray[i] >= '0' && inputArray[i] <= '9'){
                numberNum += 1;
            }else {
                otherNum += 1;
            }
        }

        System.out.println("UpperCount:" + upperNum);
        System.out.println("LowerCount:" + lowerNum);
        System.out.println("NumberCount:" + numberNum);
        System.out.println("OtherCount:" + otherNum);
    }
}


