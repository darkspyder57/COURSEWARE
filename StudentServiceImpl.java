package com.practice.fullstack.service;

import com.practice.fullstack.model.Student;
import com.practice.fullstack.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.
    }
}
