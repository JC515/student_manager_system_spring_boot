package com.stu.Service;

import com.stu.Mapper.StudentMapper;
import com.stu.Pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImpl implements StudentService {
    final
    StudentMapper studentMapper;

    public StudentServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public List<Student> getStudentList() {
        return studentMapper.getStudentList();
    }

    @Override
    public Student getStudentById(String studentId) {
        return studentMapper.getStudentById(studentId);
    }

    @Override
    public boolean deleteStudentById(String studentId) {
        return studentMapper.deleteStudentById(studentId);
    }

    @Override
    public boolean updateStudentByStudentId(Student student) {
        return studentMapper.updateStudentByStudentId(student);
    }

    @Override
    public boolean addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

}
