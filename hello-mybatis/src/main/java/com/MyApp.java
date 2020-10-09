package com;


import com.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 查询测试
 */
public class MyApp {
    public static void main(String[] args) throws IOException {
        //访问mybatis 查询数据
        //1、定义主配置文件名称，从类路径的根开始(target/class)
        String config = "mybatis.xml";
        //2、读取config文件
        InputStream in = Resources.getResourceAsStream(config);
        //3、创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //4、创建SqlSessionFactory对象
        SqlSessionFactory factory = builder.build(in);
        //5、【重要】获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //6、【重要】指定需要执行的sql语句标识。 sql映射文件中的namespace + "." + 标签的id值
        String sqlId = "com.dao.StudentDao" + "." + "selectStudent";
//        String insert = "com.dao.StudentDao" + "." + "insertStudent";
        String update = "com.dao.StudentDao" + "." + "updateStudent";
        //7、执行sql语句，
        sqlSession.selectList(update);
        List<Student> studentList = sqlSession.selectList(sqlId);
        //8、输出结果
        studentList.forEach(System.out::println);
        //9、关闭 SqlSession，释放资源
        sqlSession.close();





    }
}
