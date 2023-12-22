package com.stu.Service;

import com.stu.Pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudentList();

    Student getStudentById(String studentId);

    boolean deleteStudentById(String studentId);

    boolean updateStudentByStudentId(Student student);

    boolean addStudent(Student student);


}
