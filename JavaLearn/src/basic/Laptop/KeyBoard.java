package basic.Laptop;

public class KeyBoard implements USB{

    @Override
    public void open() {
        System.out.println("启动键盘驱动。");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘驱动。");
    }
}
