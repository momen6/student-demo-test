package com.momen.studentdemotest;

import com.momen.studentdemotest.entity.Student;
import com.momen.studentdemotest.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class StudentDemoTestApplication implements CommandLineRunner {

    private final StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(StudentDemoTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Student> banha = this.studentRepository.findStudentsByAddress("Banha");
        System.out.println(banha);
    }
}
