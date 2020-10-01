package medium.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("chushisizhi");
        FileOutputStream fos = new FileOutputStream("mubiaodizhi");

        //数组缓冲区
        byte[] bytes = new byte[1024];
        int len  = 0;
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes, 0, len);
        }

        fos.close();
        fis.close();

        long stopTime = System.currentTimeMillis();
        System.out.println("Running Time: " + (stopTime - startTime) + "Ms");

    }
}
