package com.aakash.oops3.Inheritance;

class Son extends Parent{
    int cno;
    private int gold=0;
    public int getgold() {//we can give private no also
        return this.gold;
    }
    void message() {
        System.out.println(super.hno);
    }
    Son(int a,int b,int c) {
        super(a,b);
        this.cno=c;
    }
}
