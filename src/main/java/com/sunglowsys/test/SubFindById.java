package com.sunglowsys.test;

import com.sunglowsys.domain.Subject;
import com.sunglowsys.service.SubjectServiceImpl;

public class SubFindById {
    public static void main(String[] args) {
        Subject subject=new SubjectServiceImpl().findById(2L);
        System.out.println(subject);
    }
}
