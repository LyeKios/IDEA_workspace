package basic.Extends.SendMoney;

import java.util.ArrayList;

public class Master extends User{

    public Master(){}

    public Master(String name, int restMoney) {
        super(name, restMoney);
    }

    /**
     *
     * @param total  总红包金额
     * @param count  红包个数
     * @return redList 红包List
     */
    public ArrayList<Integer> sendMoney(int total, int count){
        ArrayList<Integer> redList = new ArrayList<>();    //用于存储输出的红包金额List

        //余额变量
        int leftMoney = super.getRestMoney();

        if (total > leftMoney){
            System.out.println("余额不足！");
            return redList;
        }

        super.setRestMoney(leftMoney - total);  //扣掉部分余额

        int avg = total / count;
        int mod = total % count;

        for (int i = 0; i < count; i++) {    //装入红包
            if (i < (count - 1)){
                redList.add(avg);
            }else if(i == (count - 1)){
                redList.add(avg + mod);
            }
        }
        return redList;
    }
}
