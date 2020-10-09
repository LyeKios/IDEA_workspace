package com.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * <p>Description: 实体类 </p>
 * <p>Company: http://www.bjpowernode.com
 */
public class MyBatisUtil {
    //定义 SqlSessionFactory
    private static SqlSessionFactory factory = null;
    static {
        //使用 静态块 创建一次 SqlSessionFactory
        try{
            String config = "mybatis.xml";
            //读取配置文件
            InputStream in = Resources.getResourceAsStream(config);
            //创建 SqlSessionFactory 对象
            factory = new SqlSessionFactoryBuilder().build(in);
        }catch (Exception e){
            factory = null;
            e.printStackTrace();
        }
    }
    /* 获取 SqlSession 对象 */
    public static SqlSession getSqlSession(){
        SqlSession sqlSession = null;
        if( factory != null){
            sqlSession = factory.openSession();
        }
        return sqlSession;
    } }
