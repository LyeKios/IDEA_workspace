package basic;

/**
* 包含四个部分：
* 1、所有成员变量用private关键字修饰
* 2、为每一个成员变量编写一对Getter/Setter方法
* 3、编写一个无参数的构造方法
* 4、编写一个全参数的构造方法
*
* 也称作Java Bean
 */
public class JavaBean {
    private String name;
    private int age;

    public JavaBean() {
    }

    public JavaBean(String name, int age) {
        this.name = name;
        this.age = age;
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
}
