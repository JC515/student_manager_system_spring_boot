package com.stu.Mapper;

import com.stu.Pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from student")
    List<Student> getStudentList();

    @Select("select * from student where student_id=#{studentId}")
    Student getStudentById(String studentId);


    @Delete("delete from student where student_id=#{studentId}")
    boolean deleteStudentById(String studentId);

    boolean updateStudentByStudentId(Student student);

    @Insert("INSERT INTO student (student_id, student_name, gender, age, native_place, identity) VALUES (#{studentId},#{studentName},#{gender},#{age},#{nativePlace},#{identity})")
    boolean addStudent(Student student);


}
