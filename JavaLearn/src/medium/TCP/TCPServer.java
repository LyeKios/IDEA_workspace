package medium.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * java.net.ServerSocket
 *
 * 构造方法：
 *      ServerSocket(int port)
 */

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器端口
        ServerSocket server = new ServerSocket(8888);
        //使用accept方法获取请求客户端的对象Socket
        Socket socket = server.accept();

        //读取客户点发送的数据
        InputStream ins = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = ins.read(bytes);
        System.out.println(new String(bytes, 0, len));
        //给客户端发送数据
        OutputStream os = socket.getOutputStream();
        os.write("Got it. Thanks.".getBytes());
        socket.close();
        server.close();
    }
}
