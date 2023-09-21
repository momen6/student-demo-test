package com.momen.studentdemotest.repository;

import com.momen.studentdemotest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

//    Optional<Student> findStudentBySname(String sname);
//
//
//    @Query(value = "select s from Student s where s.sname=:sname ")
//    List<Student> fetchAllStudentsFilter(@Param(value = "sname") String sname);
//
//    @Query(value = "select s from Student s where s.id<4")
//    List<Student> fetchElRegala();

    List<Student> findStudentsByAddress(String address);

}
