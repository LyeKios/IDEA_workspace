package basic.Laptop;

public class Mouse implements USB{

    @Override
    public void open() {
        System.out.println("启动鼠标驱动。");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标驱动。");
    }

}
