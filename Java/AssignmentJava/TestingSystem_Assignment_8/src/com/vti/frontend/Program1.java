package com.vti.frontend;

import com.vti.backend.Exercise1;
import com.vti.backend.Exercise2;
import com.vti.entity.Student;

import java.util.ArrayList;

public class Program1 {
    private static ArrayList<Student> students;
    public static void main(String[] args) {
        //Q1
        Exercise1 Exer1 = new Exercise1();
        Exer1.listOfStudent();
        Exer1.countOfStudent(); //Q1.a
        Exer1.elementOfStudent(); //Q1.b,c
        Exer1.addStudent();  //Q1.d,e
        Exer1.mixStudent();  //Q1.f
        Exer1.searchStudentById();//Q1.g
        Exer1.searchStudentByName();//Q1.h
        Exer1.searchDuplicateStudent();//Q1.i
        Exer1.deleteNameStudentId2();//Q1.j
        Exer1.deleteStudentId5();//Q1.k
        Exer1.copyListStudent();//Q1.l

        //Q2
        Exer1.question2();

        //Q6
        Exer1.map();
    }

}
