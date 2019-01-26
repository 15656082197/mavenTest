package com.szq;

/**
 * Created by Administrator on 2019/1/26.
 */
public class Class {
    private int id;
    private String name;
    private Student student;

    public Class() {
    }

    public Class(int id, String name, Student student) {
        this.id = id;
        this.name = name;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
