package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import com.sunglowsys.service.StudentServiceImpl;

public class updateStudent {
    public static void main(String[] args) {
        Student student=new Student();
        student.setEmail("ShivamKashyap@gamil.com");
        new StudentServiceImpl().update(student,1L);


    }
}
