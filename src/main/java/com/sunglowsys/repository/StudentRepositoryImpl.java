package com.sunglowsys.repository;

import com.sunglowsys.domain.Student;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentRepositoryImpl implements StudentRepository{
    private SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
    @Override
    public void save(Student student) {
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();


    }

    @Override
    public void update(Student student, Long id) {

    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findByAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
