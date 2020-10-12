package com;

import com.dao.StudentDao;
import com.dao.impl.StudentDaoImpl;
import com.domain.Student;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class TestMyBatis {
    @Test
    public void testSelectStudent(){
        StudentDao dao = new StudentDaoImpl();
        List<Student> studentList = dao.selectStudent();
        studentList.forEach(System.out::println);
    }

    @Test
    public void testInsertStudent(){
        StudentDao dao = new StudentDaoImpl();
        Student student = new Student();
        student.setId(1009);
        student.setName("曹操");
        student.setEmail("shashasha@qq.com");
        student.setAge(26);
        int nums = dao.insertStudent(student);
        System.out.println("修改行数：" + nums);
    }

    @Test
    public void testUpdate() {
        StudentDao dao = new StudentDaoImpl();
        Student student = new Student();
        student.setId(1009);
        student.setName("曹操");
        student.setEmail("caocao@qq.com");
        student.setAge(28);
        int nums = dao.updateStudent(student);
        System.out.println("使用 Dao 修改数据:"+nums);
    }

    @Test
    public void testDelete() throws IOException {
        StudentDao dao = new StudentDaoImpl();
        int nums = dao.deleteStudent(1009);
        System.out.println("使用 Dao 删除数据:"+nums);
    }
}
