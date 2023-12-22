package com.stu.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Integer id;

    private String studentId;

    private String studentName;

    private Integer gender;

    private Integer age;

    private String nativePlace;

    private Integer identity;

}
