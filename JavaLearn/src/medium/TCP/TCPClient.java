package medium.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * TCP的客户端：用于向服务器发送连接请求，发送数据，读取回写
 * 表示客户端的类：
 *              java.net.Socket
 *          构造方法：
 *              Socket(String host, int port)
 *          成员方法：
 *              OutputStream getOutputStream()    返回套接字输出流
 *              InputStream getInputStream()    返回套接字的输入流
 *              void close()
 *
 */

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("10.11.51.142", 8888);
        OutputStream os = socket.getOutputStream();
        os.write("hello server".getBytes());
        InputStream ins = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = ins.read(bytes);
        System.out.println(new String(bytes, 0, len));
        socket.close();
    }
}
