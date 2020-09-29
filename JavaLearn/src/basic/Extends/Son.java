package basic.Extends;

public class Son extends Father {

    @Override
    public void show() {
        super.show();
        System.out.println("new show");
    }
}
