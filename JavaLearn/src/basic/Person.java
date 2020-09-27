package basic;

public class Person {

    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }




    public void sayHello(String who) {
        System.out.println(who + ", 你好。我是" + this.name);
    }

//    public static void main(String[] args) {
//
//    }
}
