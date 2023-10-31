package com.aakash.oops2;//these are package inside package

public class A {
    public static void main(String[] args) {
        Student a=new Student(1);
        Student b=new Student(2);
        System.out.println(a.population);//-> not correct methods
        System.out.println(b.population);//-> not correct methods
        System.out.println(Student.population);//-> correct method
    }
}
