package basic.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop Kios = new Laptop();
        Kios.powerOn();

//        Mouse mouse = new Mouse();
//        ------>
        USB mouse = new Mouse();
//        mouse.open();
//        mouse.close();
        Kios.usbDevice(mouse);

        KeyBoard key = new KeyBoard();
        Kios.usbDevice(key);
        /**
         * 可以看见，两种定义方法都可以满足USB类型接口的要求（向上转型）    原因：因为KeyBoard与Mouse是USB的实现类，实际上还是USB类
         */


        Kios.powerOff();
    }

}
