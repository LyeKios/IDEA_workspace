package basic.Static;

/**
 * static 修饰的静态变量和静态方法只属于类本身而不属于对象
 * 即可以直接Class.staticMethod, 而不是Static修饰的普通方法只有在创建对象后才能使用
 *
 * 静态方法不能访问成员变量   原因：静态内容先行加载，此时成员内容为未知
 * 静态方法不能用this关键字，   原因：this在被对象实例化后即代表当前对象，而静态变量与对象无关
 *
 * 静态代码块：生命周期中只在第一次用到本类时，静态代码块执行唯一一次，直到被销毁
 */

public class staticField {
    public static void main(String[] args) {
        Student stu1 = new Student("lye", 20);
        Student stu2 = new Student("Kios", 22);

        Student.room = "101教室";
        System.out.println("id:" + stu1.getId() + "    name:" + stu1.getName() + "     age:" + stu1.getAge() + "   room:" + Student.room);
        System.out.println("i0d:" + stu2.getId() + "    name:" + stu2.getName() + "     age:" + stu2.getAge()+ "    room:" + Student.room);

        Student.methodStatic();
        stu1.method();


    }
}
