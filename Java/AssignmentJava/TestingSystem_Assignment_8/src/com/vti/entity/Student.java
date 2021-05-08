package com.vti.entity;

public class Student {
    private static int count = 1;
    private int id;
    private String name;

    public Student(String name) {
        this.name = name;
        this.id = count;
        count++;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
