package com.springproject.cruddemo.dao;

import com.springproject.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findByLastName(String lastName);

    List<Student> findAll();

    void update(Student theStudent);

    void delete(Integer id);

    int deleteAll();
}
