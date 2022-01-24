package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import com.sunglowsys.domain.Subject;
import com.sunglowsys.repository.StudentRepositoryImpl;

public class SaveStudent {
    public static void main(String[] args) {
        StudentRepositoryImpl service=new StudentRepositoryImpl();

       Subject subject=new Subject("biology",231L);
        Subject subject1=new Subject("physics",875L);

       Student student=new Student("aditya","rajput","ak@gamil.com",8728738L);
       student.setSubject(subject);
        Student student1=new Student("kashyap","kashyap","kk@gmail,ocm",8739347L);
        student1.setSubject(subject1);

        service.save(student);
        service.save(student1);

    }
}
