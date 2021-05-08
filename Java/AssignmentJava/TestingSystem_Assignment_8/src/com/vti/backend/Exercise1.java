package com.vti.backend;

import com.vti.entity.Student;

import java.util.*;

public class Exercise1 {
    private ArrayList<Student> students;
    private Scanner scanner;

    public Exercise1() {
        scanner = new Scanner(System.in);
        students = new ArrayList<>();
    }

    public void listOfStudent(){
        students = new ArrayList<Student>();
        students.add(new Student("Chức"));
        students.add(new Student("Chức"));
        students.add(new Student("Chức"));
        students.add(new Student("Nam"));
        students.add(new Student("Đức"));
        students.add(new Student("Hải"));
        students.add(new Student("Hùng"));
        students.add(new Student("Phương"));


    }
    public void countOfStudent(){
        System.out.println(students.size());
    }

    public void elementOfStudent() {
        System.out.println("phan tu thu 4 la: "+students.get(3));
        System.out.println("phan tu dau tien la: "+students.get(0));
        System.out.println("phan tu cuoi la: "+students.get(students.size()-1));
    }
    public void addStudent() {
        students.add(0, new Student("chuc"));
        students.add(students.size(), new Student("hai"));
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    public void mixStudent() {
        Collections.reverse(students);
        for (Student student : students) {
            System.out.println(student.toString());
        }

    }
    public void searchStudentById() {
        scanner = new Scanner(System.in);
        System.out.println("Moi nhap ID: ");
        int id = scanner.nextInt();
        for (Student student : students) {
            if (student.getId() == id){
            System.out.println(student.toString());
            }
        }

    }
    public void searchStudentByName() {
        System.out.println("Nhập tên cần tìm: ");
        String name = scanner.nextLine();

        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println(student);
            }
        }
    }
    public void searchDuplicateStudent(){
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getName().equals(students.get(j).getName())) {
                    System.out.println("Các student trùng tên: ");
                    System.out.println(students.get(i).toString());
                    System.out.println(students.get(j).toString());
                }
            }
        }
    }
    public void deleteNameStudentId2() {
        for (Student student : students) {
            if (student.getId() == 2) {
                student.setName(null);
            }
            System.out.println("Danh sách student sau khi xóa name id 2: "+student.toString());
        }
    }
    public void deleteStudentId5(){
        for (Student student : students) {
            if (student.getId() == 5) {
                students.remove(student);
            }
            System.out.println("Danh sách student sau khi xóa student id 5: "+student.toString());
        }
    }
    public void copyListStudent(){
        ArrayList<Student> studentCopies = new ArrayList<>();
        studentCopies.addAll(students);
    }
    //Q2

    public void question2() {

        System.out.println("Thứ tự student đến phỏng vấn từ sớm nhất đến muộn nhất: ");
        printStudentComeEarly();

        System.out.println("Thứ tự student đến phỏng vấn từ muộn nhất đến sớm nhất: ");
        printStudentComeLate();
    }
    public void printStudentComeEarly() {
        // init data
        Stack<Student> students = new Stack<>();
        students.push(new Student("Nguyễn Văn A"));
        students.push(new Student("Trần Văn Nam"));
        students.push(new Student("Nguyễn Văn Huyên"));
        students.push(new Student("Nguyễn Văn Nam"));

        // Sử dụng pop để lấy Data Element trong stack
        System.out.println(students.pop());
        System.out.println(students.pop());
        System.out.println(students.pop());
        System.out.println(students.pop());
    }

    public void printStudentComeLate() {
        // init data
        Queue<Student> students = new LinkedList<>();
        students.add(new Student("Nguyễn Văn A"));
        students.add(new Student("Trần Văn Nam"));
        students.add(new Student("Nguyễn Văn Huyên"));
        students.add(new Student("Nguyễn Văn Nam"));

        // Sử dụng poll để lấy Data Element trong stack
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());

    }

    //Q6

    public void map(){
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Chuc");
        System.out.println(students.get(1));
    }



}
