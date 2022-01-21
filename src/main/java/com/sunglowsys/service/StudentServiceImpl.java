package com.sunglowsys.service;

import com.sunglowsys.domain.Student;
import com.sunglowsys.repository.StudentRepository;
import com.sunglowsys.repository.StudentRepositoryImpl;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    StudentRepository  repository=new StudentRepositoryImpl();


    @Override
    public void save(Student student) {
        repository.save(student);
    }

    @Override
    public void update(Student student, Long id) {

    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findByAll(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
