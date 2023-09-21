package com.momen.studentdemotest.service;

import com.momen.studentdemotest.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();
    Student findById(int id);
    void save(Student student);
    void delete(int id);

}
