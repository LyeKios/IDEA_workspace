package basic.Extends.SendMoney;

import java.util.ArrayList;
import java.util.Random;

public class NormalPeople extends User{
    public NormalPeople() {}

    public NormalPeople(String name, int restMoney) {
        super(name, restMoney);
    }

    /**
     * 获取一个随机索引，占为己有
     */
    public void receive(ArrayList<Integer> redList){
        int index = new Random().nextInt(redList.size());
        super.setRestMoney(super.getRestMoney() + redList.remove(index));
    }
}
