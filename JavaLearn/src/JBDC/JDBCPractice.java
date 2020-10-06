package JBDC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 查询表中数据并封装为对象返回
 */

public class JDBCPractice {

    public static void main(String[] args) {
        List<Query> list = new JDBCPractice().findAll();
        System.out.println(list);
    }

    /**
     * 查询所有内容
     * @return
     */
    public List<Query> findAll(){

        Connection conn = null;
        Statement stmt = null;
        ResultSet re = null;
        List<Query> list = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///myfirstdb?useSSL=false", "root", "2546216709rui");
            String sql = "select * from firsttable;";
            stmt = conn.createStatement();
            re = stmt.executeQuery(sql);
            //遍历结果集，封装集合，装载集合
            Query query = null;
            list = new ArrayList<>();

            while (re.next()){
                String name = re.getString("name");
                int id = re.getInt("id");

                query = new Query(name, id);

                //装载集合
                list.add(query);
            }


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
        return list;

    }
}
