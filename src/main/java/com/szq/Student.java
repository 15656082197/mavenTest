package com.szq;

/**
 * Created by Administrator on 2019/1/26.
 */
public class Student {
    private int id;
    private String name;
    private int classId;

    public Student() {
    }

    public Student(int id, String name, int classId) {
        this.id = id;
        this.name = name;
        this.classId = classId;
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

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ClassId=" + classId +
                '}';
    }
}
