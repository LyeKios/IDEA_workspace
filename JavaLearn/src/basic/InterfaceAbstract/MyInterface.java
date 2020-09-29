package basic.InterfaceAbstract;

/**
 * 接口当中的抽象方法，修饰符必须是两个固定的 public abstract
 *
 */

public interface MyInterface {
    public abstract void methodAbs();

    public default void methodDefault() {
        System.out.println("Default");
    }


}
