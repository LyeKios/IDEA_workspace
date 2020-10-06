package JBDC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC快速入门
 */

public class JDBCDemo1 {
    public static void main(String[] args) throws Exception {
        //导入驱动jar包
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");      //可以省略，jar包可以自动进行注册驱动
        //获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirstdb?useSSL=false", "root", "2546216709rui");
//        String sql1 = "insert into firsttable (name, id) values (15458, 5);";
        String sql1 = "select * from firsttable;";
        //获取执行sql语句的对象
        Statement stmt = conn.createStatement();
        //执行语句
//        int count = stmt.executeUpdate(sql1);
        System.out.println(stmt.executeQuery(sql1));
//        System.out.println(count);
        //释放资源
        stmt.close();
        conn.close();

    }
}
