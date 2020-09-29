package basic.Laptop;

public class Laptop {

    public void powerOn(){
        System.out.println("开机执行。");
    }

    public void powerOff(){
        System.out.println("关机执行。");
    }

    public void usbDevice(USB usb){
        usb.open();
        usb.close();
    }
}
