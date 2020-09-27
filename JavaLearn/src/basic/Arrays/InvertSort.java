package basic.Arrays;

import java.util.Arrays;

public class InvertSort {
    public static void main(String[] args) {
        String str = "kahdfoHIOUD54564DADdwCDWEFCwcfwfc544";

        char[] chars = str.toCharArray();
        Arrays.sort(chars);  //升序

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }

    }
}
