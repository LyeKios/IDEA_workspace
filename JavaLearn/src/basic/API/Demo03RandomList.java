package basic.API;

import java.util.ArrayList;
//import Demo01Random;

public class Demo03RandomList {
    public static void main(String[] args) {
        int listSize = 10;
        int ranStart = 50;
        int ranStop = 100;

        ArrayList<Integer> randomList= new ArrayList<>();

        for (int i = 0; i < listSize; i++) {
            int temp = Demo01Random.randomRange(ranStart, ranStop);
            randomList.add(temp);
        }

        System.out.println(randomList);

    }
}
