package medium.Check;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCheck {
    public static void main(String[] args) throws IOException {
        Calculator c = new Calculator();
        Class cls = c.getClass();
        Method[] methods = cls.getMethods();

        int num = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));

        for(Method method : methods){
            if (method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    //捕获异常
                    num ++;
                    bw.write(method.getName() + "方法出异常了");
                    bw.newLine();
                    bw.write("异常的名称:" + e.getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常原因:" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("------------------------------------");
                    bw.newLine();
                }
            }
        }
        bw.write("本次测试共有" + num + "次异常");
        bw.flush();
        bw.close();
    }


}
