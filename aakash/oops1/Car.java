package com.aakash.oops1;

class Car {
    int price;
    String colour;
    Car() {
//        this.price=0;
//        this.colour="hix";
        this(2,3);//-> this also used to call a constructor
    }
    Car(int a,int b) {
        this.price=a;
    }
    Car(Car b) {
        this.price=b.price;

    }
    Car(int pri,int b,int c) {
        this.price=pri;//-> correct but try to use this

    }
    void price() {
        System.out.println("this is your car price"+price);//-> correct but try to use this
    }
//    Car(int price,int b,int c) {
//        price=price;//print 0 as no no this keyword use it is inderstanding both keyword as same
//        this.price =price;//this time it will give price equal to price paseed in constructor
//    }


}
//Car a=new Car(); //a is refernce variable to new object created of class Car
//object are stored in heap memory
//reference variable in stack
//primitive data type are stored in stack so they  are not object so during declaration no new keyword used

//Car a=new Car();
//Car b=a;
//so they both now points to same object
//a.price=3;//changed
//b.price will also be equal to 3
//so everything is ok