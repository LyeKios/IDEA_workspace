package com;

import com.domain.Student;
import com.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        //5、【重要】获取SqlSession对象
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        //6、【重要】指定需要执行的sql语句标识。 sql映射文件中的namespace + "." + 标签的id值
        String sqlId = "com.dao.StudentDao.selectStudent";
//        String insert = "com.dao.StudentDao" + "." + "insertStudent";
//        String update = "com.dao.StudentDao" + "." + "updateStudent";
        //7、执行sql语句，
//        sqlSession.selectList(update);
        List<Student> studentList = sqlSession.selectList(sqlId);
        //8、输出结果
        studentList.forEach(System.out::println);
        //9、关闭 SqlSession，释放资源
        sqlSession.close();





    }
}
