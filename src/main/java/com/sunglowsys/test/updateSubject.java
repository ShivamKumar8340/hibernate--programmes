package com.sunglowsys.test;


import com.sunglowsys.domain.Subject;
import com.sunglowsys.service.SubjectServiceImpl;

public class updateSubject {
    public static void main(String[] args) {
        Subject subject =new Subject();
        subject.setSubName("Computer");
        new SubjectServiceImpl().update(subject,2L);

    }
}
