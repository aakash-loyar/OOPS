package com.aakash.oops3.Inheritance;

public class main {
    public static void main(String[] args) {
        Son a=new Son(1,2,3);//allowed
        a.cno=2;
        //System.out.println(super.hno);
        System.out.println(a.cno);

        a.getgold();//we can get private //but cannot set it

        //Son b=new Parent(1,2);//not allowed
        Parent p=new Parent(1,2);
        Parent q=new Son(1,2,3);//allowed//but canot access cno
        //System.out.println(q.cno);

    }
}
//1.A a=new B();
// A is type of reference variable
//B is type of object
// A will decide what property will it have access
//B decide what are the property to initialised
//if equal properties and same properties then also not allowed