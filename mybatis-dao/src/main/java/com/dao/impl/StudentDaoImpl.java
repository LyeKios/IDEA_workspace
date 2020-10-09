package com.dao.impl;

import com.dao.StudentDao;
import com.domain.Student;
import com.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> selectStudent() {
        //获取SqlSession对象
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        String sqlId = "com.dao.StudentDao.selectStudent";
        List<Student> students = sqlSession.selectList(sqlId);
//        students.forEach(System.out::println);
        sqlSession.close();
        return students;
    }

    @Override
    public int insertStudent(Student student) {
        //获取SqlSession对象
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        String sqlId = "com.dao.StudentDao.insertStudent";
        int nums = sqlSession.insert(sqlId, student);
//        students.forEach(System.out::println);
        sqlSession.commit();
        sqlSession.close();
        return nums;
    }

    @Override
    public int updateStudent(Student student) {
        SqlSession session = MyBatisUtil.getSqlSession();
        int nums = session.insert(
                "com.dao.StudentDao.updateStudent",student);
        session.commit();
        session.close();
        return nums;
    }

    @Override
    public int deleteStudent(int id) {
        SqlSession session = MyBatisUtil.getSqlSession();
        int nums = session.insert(
                "com.dao.StudentDao.deleteStudent",id);
        session.commit();
        session.close();
        return nums;
    }
}
