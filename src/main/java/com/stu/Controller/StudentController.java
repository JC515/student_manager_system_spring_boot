package com.stu.Controller;

import com.stu.Pojo.Response;
import com.stu.Pojo.Student;
import com.stu.Service.StudentServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:5173")
public class StudentController {
    final
    StudentServiceImpl studentServiceImpl;

    public StudentController(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }

    @GetMapping("/getList")
    public Response<List<Student>> getStudentList() {
        List<Student> studentList = studentServiceImpl.getStudentList();
        return Response.success(studentList);
    }//接口测试通过

    @GetMapping("/getStudentById")
    public Response<Student> getStudentById(@RequestParam("Id") String studentId) {
        Student student = studentServiceImpl.getStudentById(studentId);
        if (student == null) {
            return Response.error(0, "此用户不存在");
        } else {
            return Response.success(student);
        }
    }//接口测试通过

    @DeleteMapping("/deleteStudentById")
    public Response<String> deleteStudentById(@RequestParam("Id") String studentId) {
        boolean deleted = studentServiceImpl.deleteStudentById(studentId);
        if (deleted) {
            return Response.success("成功删除学生信息");
        } else {
            return Response.error(0, "删除学生信息失败");
        }
    }//接口测试通过

    @PutMapping("/updateStudentByStudentId")
    public Response<String> updateStudentByStudentId(@RequestBody Student student) {
        boolean updated = studentServiceImpl.updateStudentByStudentId(student);
        if (updated) {
            return Response.success("成功更新学生信息");
        }
        return Response.error(0, "更新学生信息失败");
    }//接口测试通过

    @PostMapping("/addStudent")
    public Response<String> addStudent(@RequestBody Student student) {
        Student stu = studentServiceImpl.getStudentById(student.getStudentId());
        if (stu != null) {
            return Response.error(0, "该学生ID已存在");
        }
        boolean added = studentServiceImpl.addStudent(student);
        if (added) {
            return Response.success("成功添加学生信息");
        }
        return Response.error(0, "添加学生信息失败");
    }//接口测试通过
}
