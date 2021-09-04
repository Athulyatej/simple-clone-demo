package com.simple.clone.simpleclonedemo.service;

import com.simple.clone.simpleclonedemo.bean.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public Student findStudent(long id) {
        return new Student(id, "Athulyatej", "678553");
    }
}
