package com.momen.studentdemotest.controller;

import com.momen.studentdemotest.entity.Student;
import com.momen.studentdemotest.service.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class StudentRestController {

    private final StudentServiceImpl service;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return service.findAll();
    }
    @GetMapping("/students/{id}")
    public Student findById(@PathVariable int id){
        Student student = service.findById(id);
        if (student == null)
            throw new RuntimeException("this ID doesn't Exist");
        return student;
    }
    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student){
        student.setId(0);
        service.save(student);
        return student;
    }
    @PutMapping("/students")
    public String UpdateStudent(@RequestBody Student student){
        service.save(student);
        return "Student Updated!!";
    }
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id){
        Student student = service.findById(id);
        if (student == null)
            throw new RuntimeException("this ID doesn't Exist");
        service.delete(id);
        return "Student Deleted!!";
    }
    @GetMapping("/students/address/{address}")
    public List<Student> findAddress(@PathVariable String address){
        List<Student> students = service.findAllFromBanha(address);
        if (students.isEmpty())
            throw new RuntimeException("Couldn't find!!");
        return students;
    }
}








