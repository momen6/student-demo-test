package com.momen.studentdemotest.service;

import com.momen.studentdemotest.entity.Student;
import com.momen.studentdemotest.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;


    @Override
    public List<Student> findAll() {

        return repository.findAll();
    }

    @Override
    public Student findById(int id) {
        Optional<Student> result = repository.findById(id);
        Student student = null;
        if (result.isPresent())
            student = result.get();
        else
            throw new RuntimeException("couldn't find this student id - " + id);

        return student;
    }

    @Override
    public void save(Student student) {
        repository.save(student);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
