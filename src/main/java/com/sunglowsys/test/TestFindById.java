package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import com.sunglowsys.service.StudentServiceImpl;

public class TestFindById {
    public static void main(String[] args) {
        Student student=new StudentServiceImpl().findById(4L);
        System.out.println(student.getId()+" "+student.getFirstName()+" "+student.getEmail()+" "+student.getMobile());
        System.out.println(student.getSubject().getId()+" "+student.getSubject().getCode()+" "+student.getSubject().getSubName());
    }
}
