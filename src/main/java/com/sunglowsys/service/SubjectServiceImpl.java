package com.sunglowsys.service;

import com.sunglowsys.domain.Subject;
import com.sunglowsys.repository.SubjectRepository;
import com.sunglowsys.repository.SubjectRepositoryImpl;

import java.util.List;

public class SubjectServiceImpl implements SubjectService{
    SubjectRepository subjectRepository=new SubjectRepositoryImpl();

    @Override
    public void save(Subject subject) {
        subjectRepository.save(subject);


    }

    @Override
    public void update(Subject subject, Long id) {

    }

    @Override
    public List<Subject> findAll() {
        return null;
    }

    @Override
    public Subject findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
