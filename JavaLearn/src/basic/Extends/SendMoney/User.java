package basic.Extends.SendMoney;

public class User {
    private String name;   //用户属性-姓名
    private int restMoney;   //用户属性-余额

    public User(){}

    public User(String name, int restMoney) {
        this.name = name;
        this.restMoney = restMoney;
    }

    public void information(){
        System.out.println("User:" + this.name + "  restMoney:" + this.restMoney);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRestMoney() {
        return restMoney;
    }

    public void setRestMoney(int restMoney) {
        this.restMoney = restMoney;
    }


}
