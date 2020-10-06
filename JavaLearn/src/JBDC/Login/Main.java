package JBDC.Login;

import java.sql.*;
import java.util.Scanner;

/**
 * 键盘输入username和password 查询登录状态
 * select * from user where username = "" and password = ""
 * 如果返回值有结果则登录成功
 */

public class Main {


    public static void main(String[] args) {
        //键盘输入
        System.out.println("Input the username: ");
        String username = new Scanner(System.in).nextLine();
        System.out.println("Input the password: ");
        String password = new Scanner(System.in).nextLine();

        boolean flag = new Main().login(username, password);
        if (flag){
            System.out.println("login success!");
        }else {
            System.out.println("login failed!");
        }
    }


    /**
     * Login method
     */
    public boolean login(String username, String password){
        if (username == null || password == null){
            return false;
        }
        Connection conn = null;
        Statement stmt = null;
        ResultSet re = null;
        //连接数据库判断密码对应
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///myfirstdb?useSSL=false", "root", "2546216709rui");
            String sql = "select * from user where username = '" + username +"'and password = '" + password  + "';";
            stmt = conn.createStatement();
            re = stmt.executeQuery(sql);
            return re.next();


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if(re != null){
                try {
                    re.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

        return false;


    }
}
