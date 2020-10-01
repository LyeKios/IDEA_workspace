package medium.Thread;

import jdk.swing.interop.SwingInterOpUtils;

public class MyThread extends Thread{
    /**
     * 重写RUN方法，设置线程任务
     */
    @Override
    public void run() {
//        super.run();
        //获取线程名称
        String name = getName();
        System.out.println(name);

        Thread t = Thread.currentThread();
        System.out.println(t);
    }
}
