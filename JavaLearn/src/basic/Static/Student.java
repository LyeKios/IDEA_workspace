package basic.Static;

/**
 * 构造示例类
 */

public class Student {
    private int id; //学号
    private String name;
    private int age;
    static String room;
    private static int idCounter = 0;  //记录当前学生位数

    public Student() {
        this.id = ++idCounter;
    }

    static {
        System.out.println("第一次调用Student类。");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void method(){
        System.out.println("normal method.");
    }

    public static void methodStatic(){
        System.out.println("static method");
    }


}
