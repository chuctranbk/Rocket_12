package com.vti.entity;

import java.util.Comparator;

public class SortByMark implements Comparator<Student1> {
    @Override
    public int compare(Student1 o1, Student1 o2) {
        if (o1.getMark() > o2.getMark()){
            return 1;
        }
        else if (o1.getMark() < o2.getMark()){
            return -1;
        }
        else {
        return 0;
        }
    }
}
