package com.dao;

import com.domain.Student;

import java.util.List;

public interface StudentDao {

    List<Student> selectStudent();

    int insertStudent(Student student);

    int updateStudent(Student student);

    int deleteStudent(int id);

}
