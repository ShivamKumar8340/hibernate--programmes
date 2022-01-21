package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import com.sunglowsys.domain.Subject;
import com.sunglowsys.repository.StudentRepositoryImpl;

public class SaveStudent {
    public static void main(String[] args) {
        StudentRepositoryImpl service=new StudentRepositoryImpl();

       // Subject subject=new Subject("math",2001L);
        Subject subject1=new Subject("English",87738L);

       // Student student=new Student("amit","kashyap","amit@gamil.com",8723878738L);
      //  student.setSubject(subject);
        Student student1=new Student("ravi","kumar","ravi@gmail,ocm",879347L);
        student1.setSubject(subject1);

       // service.save(student);
        service.save(student1);

    }
}
