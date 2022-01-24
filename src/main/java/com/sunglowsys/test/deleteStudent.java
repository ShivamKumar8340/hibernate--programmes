package com.sunglowsys.test;

import com.sunglowsys.service.StudentServiceImpl;

public class deleteStudent {
    public static void main(String[] args) {
        new StudentServiceImpl().delete(2L);
    }

}
