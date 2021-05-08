package com.vti.entity;

import java.time.LocalDate;
import java.util.*;

public class CollectionsSample {
    public static void main(String[] args) {
//        List<Integer> arrList = new ArrayList<Integer>();
//        // them vao danh sach
//        arrList.add(5);
//        arrList.add(6);
//        arrList.add(7);
//        arrList.add(8);
//
//        System.out.println(arrList.toString());
//        System.out.println(arrList.size());
//        System.out.println(arrList.get(3));
//
//        Set<Integer> set = new TreeSet<Integer>();
//        set.add(3);
//        set.add(2);
//        set.add(4);
//        for (Integer set1: set) {
//            System.out.println(set1.toString());
//
//        }

//        Map<String, String> hocVien = new HashMap();
//        hocVien.put("Chuc", "Dell");
//        hocVien.put("Hoang","Dell");
//
//        System.out.println(hocVien.get("Chuc"));
        List<Student1> students = new ArrayList<Student1>();
        students.add(new Student1("Kim", 7, 8));
        students.add(new Student1("Chuc", 7, 12));
        students.add(new Student1("Kim", 7, 10));
        students.add(new Student1("Kim", 8, 10));
        students.add(new Student1("Kiên",5 , 6));

        Collections.sort(students, new SortByAge());
        for (Student1 student:students) {
            System.out.println(student.toString());
        }
        System.out.println("===========");

        Collections.sort(students, new SortByMark());
        for (Student1 student:students) {
            System.out.println(student.toString());
        }
        System.out.println("===========");

        Collections.sort(students, new SortByMark().thenComparing(new SortByAge()));
        for (Student1 student:students) {
            System.out.println(student.toString());
        }

    }


}
