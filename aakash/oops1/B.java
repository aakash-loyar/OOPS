package com.aakash.oops1;

public class B {
    public static void main(String[] args) {
        Integer a=2;
        Integer b=3;
        swap(a,b);
        System.out.println(a+ " "+b);//not swapped bcz it is final class;
        final int c=0;
        //c++; -> cannot
        final int d;//initialise during declaring
        System.out.println(c);
        //System.out.println(d);
        final Student s1=new Student();
        final Student s2=new Student();
        s1.a=2;//you can but
        //s1=s2;//->you cannot//as final
        for(long i=0;i<100000000;i++) {
            //Student x=new Student();
        }

    }
    static void swap(Integer a,Integer b) {
        Integer temp=a;
        a=b;
        b=temp;
    }
}
class Student {
    int a;
    int b;
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }//java does not allow us to delete any object grarbage collection
    //but allow us some action whenever object is destroyed//this is the way to handle garbage collection

}
