package com.vti.frontend;

import com.vti.entity.Student3;

public class Program3 {
    public static void main(String[] args) {
//        Student3<Integer> stu = new Student3<Integer>(1, "Chuc");
//        Student3<Float> stu1 = new Student3<Float>(1.0f, "Chuc");
//        Student3<Double> stu2 = new Student3<Double>(1.0d, "Chuc");
//        System.out.println(stu.toString());
//        System.out.println(stu1.toString());
//        System.out.println(stu2.toString());

        Program3 program3 = new Program3();
        program3.print("student");
        program3.print(4);
        program3.print(4.0);
    }

    <T> void print(T a) {
        System.out.println(a);
    }
}
