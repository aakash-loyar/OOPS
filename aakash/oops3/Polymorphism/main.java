package com.aakash.oops3.Polymorphism;

public class main {
    public static void main(String[] args) {
        Shapes a=new Shapes();
        Square b=new Square();
        Shapes c=new Square();//upcasting
        //Square d=new Shapes();-> not allowed
        a.area();
        b.area();
        c.area();//it means method of child class can be accessed by parent
        //static method cannot be overriden
        //overriding depends on object and static does not depend on object that is why
    }
}
