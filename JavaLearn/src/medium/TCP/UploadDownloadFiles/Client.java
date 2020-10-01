package medium.TCP.UploadDownloadFiles;

import java.io.*;
import java.net.Socket;

/**
 * 读取本地文件-上传-接收信息
 *
 *      src：D:\\MyCode\\Java\\JavaClient\\1.jpg
 *      tar: Server
 *
 *      本地字节输入流：FileInputStream 构造中指定src地址
 *      客户端Socket对象，构造中指定服务器IP与Port
 *      Socket.getOutputStream 网络字节输出流
 *      FileInputStream.read 读取本地文件
 *      OutputStream.write 输出文件上传
 *      Socket.getInputStream 获取网络字节输入流的返回
 *      InputStream.read 读取回执
 *      释放
 *
 */

public class Client {
    public static void main(String[] args) throws IOException {
        FileInputStream fins = new FileInputStream("D:\\MyCode\\Java\\JavaClient\\1.jpg");
        Socket socket = new Socket("10.11.51.142", 8888);
        OutputStream os = socket.getOutputStream();

        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fins.read(bytes)) != -1){
            os.write(bytes,0, len);
        }
        /*弥补终止符号没上传
         */
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        while ((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0, len));
        }

        fins.close();
        socket.close();
    }

}
