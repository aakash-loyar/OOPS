package com.aakash.oops4.checker;

import com.aakash.oops4.A;

public class D extends A{
    public static void main(String[] args) {
        A x=new A();
        //x.c=4;
        //x.b=3;
        //x.b=3;
        x.a=2;
        D y=new D();
        y.b=3;//only subclass can access protected


    }
}
//different package