package com.dao;
/**
 * 编写 Dao 接口 Mapper 映射文件 StudentDao.xml
 * 要求：
 * 1. 在 dao 包中创建文件 StudentDao.xml
 * 2. 要 StudentDao.xml 文件名称和接口 StudentDao 一样，区分大小写的一样。
 */

import com.domain.Student;

import java.util.List;

/**
 * 接口
 */

public interface StudentDao {
    //查询 所有数据
    public void insertStudent();
    public void updateStudent();
    public List<Student> selectStudent();
}
