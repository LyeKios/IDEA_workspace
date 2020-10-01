package medium.Thread;

public class MainThread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

        new MyThread().start();
        new MyThread().start();
        new MyThread().start();

    }
}
