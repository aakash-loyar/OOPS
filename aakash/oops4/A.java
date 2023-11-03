package com.aakash.oops4;

public class A {
    public int a;
    protected int b;
    int c;

    private int d;
    public A() {

    }
    A(int a) {
        this.a=a;
    }
    void func1() {
        System.out.println(a);
    }

}
//same package same class


//            |class| Package|  subC/same package| subC/diff package|diff package not sub|
//public        +       +          +                   +                 +
//protected     +       +          +                   +
//nomodifiers   +       +          +
//private       +       