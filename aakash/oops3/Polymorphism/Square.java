package com.aakash.oops3.Polymorphism;

class Square extends Shapes{
    //@Override//means overriden
     void area() {
        System.out.println("Area of square is s*s");
    }
   // @Override//annotation giving error means not overriden
    void Area() {
        System.out.println("Area of square is s*s");
    }
}
