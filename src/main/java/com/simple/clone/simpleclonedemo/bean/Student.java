package com.simple.clone.simpleclonedemo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@ToString
@Data
public class Student implements Serializable {

    private long id;
    private String name;
    private String pin;
}
