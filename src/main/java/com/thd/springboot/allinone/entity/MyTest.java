package com.thd.springboot.allinone.entity;


import java.sql.Timestamp;

/**
 * @author devil13th
 **/
public class MyTest {
    private String name;
    private Timestamp datetime;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
