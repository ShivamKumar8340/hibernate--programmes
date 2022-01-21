package com.sunglowsys.repository;

import com.sunglowsys.domain.Subject;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class SubjectRepositoryImpl implements SubjectRepository{

    private SessionFactory sessionFactory= HibernateUtil.getSessionFactory();

    @Override
    public void save(Subject subject) {
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(subject);
        session.beginTransaction().commit();
        session.close();

    }

    @Override
    public void update(Subject subject, Long id) {

    }

    @Override
    public List<Subject> findAll() {
        return null;
    }

    @Override
    public Subject findById() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
