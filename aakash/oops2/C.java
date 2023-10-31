package com.aakash.oops2;
class Men {
    static int weight;
    Men(int a) {
        this.weight=a;
    }
    @Override
    public String toString() {
        return "hi papu";
    }
}
public class C {
//    static class Men {
//        int weight;
//        Men(int a) {
//            this.weight=a;
//        }
//    }
    public static void main(String[] args) {
        Men a=new Men(3);
        Men b=new Men(4);
        System.out.println(a.weight);
        System.out.println(b.weight);
        System.out.println(a);


    }
    void func1() {
        Men a=new Men(4);
    }
}
//1. when outside Class c men class does not depend on object of class C
//2. when inside it depend so you cannot call
//3.but you can make it static the use it inside;
//print different value of weight inside bcz
//Men does not depend on C instance
//But they main and men can have different instance
//But outside then print same
//not to understand understandable 3 lines are important