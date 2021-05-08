package com.vti.backend;

import com.vti.entity.Student2;


import java.time.LocalDate;
import java.util.*;

public class Exercise2 {
    private List<Student2> students;

    public Exercise2() {
        students = new ArrayList<>();
        inputStudents();
    }

    private void inputStudents() {
        students.add(new Student2("Kim", LocalDate.parse("2020-05-29"), 8));
        students.add(new Student2("Kim", LocalDate.parse("2020-05-29"), 10));
        students.add(new Student2("Kiên", LocalDate.parse("2015-05-04"), 6));
        students.add(new Student2("Duy", LocalDate.parse("2020-01-29"), 5));
        students.add(new Student2("Thắng", LocalDate.parse("2020-04-29"), 8));
        students.add(new Student2("Bích", LocalDate.parse("2020-02-29"), 3));

        System.out.println("List student vừa khởi tạo: ");
        printStudent();
    }

    private void printStudent() {
        for (Student2 st : students) {
            System.out.println(st.toString());
        }
    }
    public void xapXep() {
        for (Student2 st : students) {
            Collections.sort(students);
            System.out.println("List sau khi sắp xếp theo tên/ ngày sinh/ điểm: ");
            printStudent();
        }
    }

}
