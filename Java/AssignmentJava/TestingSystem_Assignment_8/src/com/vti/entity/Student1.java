package com.vti.entity;

public class Student1 implements Comparable<Student1>{
    private String name;
    private int mark;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student1(String name, int mark, int age) {
        this.name = name;
        this.mark = mark;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student1 other) {
        if(this.age > other.getAge()){
           return 1;
        }
        else if(this.age < other.getAge()){
            return -1;
        }
        else {
            return 0;
        }


    }
}
