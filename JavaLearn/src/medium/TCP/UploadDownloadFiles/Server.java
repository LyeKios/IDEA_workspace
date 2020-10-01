package medium.TCP.UploadDownloadFiles;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * 读取上传的文件-保存文件-返回信息
 *
 *      src: getInputStream
 *      tar: D:\\MyCode\\Java\\JavaServer\\1.jpg
 *
 *      创建服务器ServerSocket对象，构造时指定端口号
 *      使用accept获取客户端Socket对象
 *      使用Socket的getInputStream,获取网络字节输入流InputStream对象
 *      判断tar路径是否存在，不存在则创建一个
 *      创造本地字节输出流FileOutputStream, 构造时指定目标路径
 *      使用网络字节输入流InputStream的read读取客户端上传的文件
 *      使用本地字节输出流FileOutputStream对象中的方法write，将读取到的文件保存到服务器目标地址
 *      使用Socket的getOutputStream,获取网络字节输入流OutputStream对象
 *      使用网络字节输出流OutputStream.write, 回传“上传成功”
 *      释放资源/ FileOutputStream，Socket，ServerSocket
 */

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);

        while (true){
            Socket socket = server.accept();

            /*
             * 多线程提高效率
             * 一位用户上传，就开启一个线程，完成文件上传
             */
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        InputStream ins = socket.getInputStream();
                        File file = new File("D:\\MyCode\\Java\\JavaServer");
                        if (!file.exists()){file.mkdirs();}

                        String fileName = "\\" + new Random().nextInt(10) + ".jpg";
                        FileOutputStream fos = new FileOutputStream(file + fileName);

                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = ins.read(bytes)) != -1){
                            fos.write(bytes,0,len);
                        }

                        socket.getOutputStream().write("文件上传成功！".getBytes());

                        fos.close();
                        socket.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();


//            InputStream ins = socket.getInputStream();
//            File file = new File("D:\\MyCode\\Java\\JavaServer");
//            if (!file.exists()){file.mkdirs();}
//
//            String fileName = "\\" + new Random().nextInt(10) + ".jpg";
//            FileOutputStream fos = new FileOutputStream(file + fileName);
//
//            int len = 0;
//            byte[] bytes = new byte[1024];
//            while ((len = ins.read(bytes)) != -1){
//                fos.write(bytes,0,len);
//            }
//
//            socket.getOutputStream().write("文件上传成功！".getBytes());
//
//            fos.close();
//            socket.close();

        }

//        server.close();
    }
}
