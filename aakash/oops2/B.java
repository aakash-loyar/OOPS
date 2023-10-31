package com.aakash.oops2;
import com.aakash.oops2.Temp.Human;
import static com.aakash.oops2.Temp.Human.message;
//import com.aakash.oops2.Temp.Human.func1;-> cannot do this bcz func1 is not static
public class B {
    public static void main(String[] args) {
        Human a=new Human();
        a.message();
        a.func1();
        message();

    }
    static void solve() {
        //func1();//-> not static depend on object so cannot call directly
        //but can be called with instance of main class
        B instance1=new B();
        instance1.func1();//-> correct

    }
    void func1() {
        solve();//static can be called inside non static
    }
}

//1. why is main static
//bcz main is the first thing that will be runned
//so main does not depend on object of any class so it is static

//2. function are methods
//3. instances are objects
//4.not static cannot be called inside static
//5.static can be called inside static or non-static
//6.
