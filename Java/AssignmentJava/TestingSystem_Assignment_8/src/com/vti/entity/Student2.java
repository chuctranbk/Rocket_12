package com.vti.entity;

import java.time.LocalDate;
import java.util.List;


public class Student2 implements Comparable<Student2> {
    private static int count = 1;
    private int id;
    private String name;
    private LocalDate birthDay;
    private int score;

    public Student2(String name, LocalDate birthDay, int score) {
        this.name = name;
        this.birthDay = birthDay;
        this.score = score;
        this.id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public float getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", score=" + score +
                '}';
    }

    public int compareTo(Student2 student) {
        if (name.compareTo(student.name) > 0) {
            return 1;
        }

        if (name.compareTo(student.name) < 0) {
            return -1;
        }

        return 0;
    }
}
