package medium.Doudizhu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * 准备牌
 * 洗牌
 * 发牌
 * 看牌
 */

public class MainDemo {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();

        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        poker.add("大王");
        poker.add("小王");

        for(String number : numbers){
            for (String color : colors) {
                poker.add(color + number);
            }
        }

        //洗牌
        Collections.shuffle(poker);
//        System.out.println(poker);

        //发牌
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        ArrayList<String> Dipai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);

            if (i >= 51){
                Dipai.add(p);
            }else if (i%3 == 0){
                play1.add(p);
            }else if (i%3 == 1){
                play2.add(p);
            }else{
                play3.add(p);
            }
        }

        System.out.println("play1: " + play1);
        System.out.println("play2: " + play2);
        System.out.println("play3: " + play3);
        System.out.println("Dipai: " + Dipai);

    }

}
