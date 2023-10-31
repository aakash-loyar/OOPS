package com.aakash.oops1;

public class A {
    public static void main(String[] args) {
        //Car a=new Car();//without declaring a constructor a default constructor is already declared
        Car b=new Car(5,4);
        Car c=new Car(b);
        c.price();
        System.out.println(c.colour);//-> null
        Car random =new Car();
        Car d=new Car(2,3,4);
        System.out.println(d.price);

    }
}
//Car a=new Car()->in heap memory// during run time
//  |
//  ^
//  in stack memory//during compile time
//this keyword -> object replaces it whenever is called;
