package com.aakash.oops4.checker;

import com.aakash.oops4.A;

public class E {
    public static void main(String[] args) {
        A x=new A();
        //x.c=4;
        //x.b=3;
        x.a=2;
        E y=new E();
        //y.b=3;//not a subclass so cannot access protected
    }
}



