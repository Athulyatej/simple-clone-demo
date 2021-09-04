package com.simple.clone.simpleclonedemo.controller;

import com.simple.clone.simpleclonedemo.bean.Student;
import com.simple.clone.simpleclonedemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HelloWorldController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/student/{id}")
    public Student getStudent(@PathVariable long id) {
        return studentService.findStudent(id);
    }
}
