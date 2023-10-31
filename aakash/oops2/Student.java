package com.aakash.oops2;

public class Student {
    int rno;
    static int population;
    Student(int rno) {
        this.rno=rno;
        //this.population+=1;-> correct but try to call with class
        Student.population+=1;
    }
}
