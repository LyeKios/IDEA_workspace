package basic.SystemD;

public class Demo {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(time);

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.arraycopy(arr1, 0, arr2, 4, 4);      //源，起始，目标，起始，位数
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
