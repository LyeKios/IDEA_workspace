package basic.Extends.SendMoney;

import java.util.ArrayList;

public class RedMain {
    public static void main(String[] args) {
        Master master = new Master("Lye", 500);
        NormalPeople one = new NormalPeople("Farmer1", 0);
        NormalPeople two = new NormalPeople("Farmer2", 5);
        NormalPeople three = new NormalPeople("Farmer3", 2);
        NormalPeople four = new NormalPeople("Farmer4", 1);

        master.information();
        one.information();
        two.information();
        three.information();
        four.information();
        System.out.println("====================================");

        ArrayList<Integer> redList = master.sendMoney(70,4);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);
        four.receive(redList);

        master.information();
        one.information();
        two.information();
        three.information();
        four.information();
        System.out.println("====================================");

    }
}
