package com.sunglowsys.repository;

import com.sunglowsys.domain.Student;

import java.util.List;

public interface StudentRepository {

   void save(Student student);
   void update(Student student,Long id);

   List<Student> findAll();
   Student findByAll();
   void delete (Long id);

}
