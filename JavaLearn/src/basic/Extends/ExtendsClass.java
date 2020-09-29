package basic.Extends;

/**
 * Extends : public class Son extends Father
 * 继承主要解决的问题：共性抽取    (父类、基类、超类   ->    子类、派生类)
 *
 * 局部变量：直接写变量名
 * 本类成员变量：  this.成员变量名
 * 父类成员变量：  super.成员变量名
 *
 * 重写(override): 方法名一样，参数一样
 * 重载(overload): 方法名一样，参数不一样
 *
 * 子类方法返回值必须【小于等于】分类方法的返回值范围
 * 子类方法权限必须【大于等于】父类方法的权限修饰符  public > protected > (default) > private
 *
 * 父类包含有参构造时，子类中不能缺省构造方法    加入 super(args); 重载构造     --super必须在第一个语句，因此super构造方法只能调用一次
 *
 * 不能多继承，但是可以多级继承
 *
 * 抽象的概念 ：父类不能确定方法体实现 但是具体实现需要对象定义后才确定，如图形-三角形的面积计算
 * 抽象方法：在方法名前加上abstract关键字，直接分号结束不需要大括号
 * 抽象类： 抽象方法所在的类必须是抽象类。class前加上abstract关键字
 * 使用方法： 1、抽象类不能直接创建
 *          2、必须在子类继承后进行实例化
 *          3、子类中覆盖重写抽象方法
 */

public class ExtendsClass {
    public static void main(String[] args) {
        Son a = new Son();

        a.show();

        AbstractSon Abs = new AbstractSon();
        Abs.eat();
    }
}
