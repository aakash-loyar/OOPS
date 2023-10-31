package com.aakash.oops2.Temp;

public class Human {
    int a;
    public static void message() {
        System.out.println("hi baby");
        //System.out.println(this.a);-> cannot do this bcz inside static you cannot use this
    }
    public void func1() {
        System.out.println("I am not static");
    }
}
