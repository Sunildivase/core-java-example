package com.staticinnerclass.service.example1;

public class StaticClassDemo {

    public static void main(String[] args) {

        Outer.Inner inner= new Outer.Inner();
        inner.state="MH";
        inner.country="IN";
        inner.printData();

        Outer outer = new Outer();
        outer.city="DEL";
        System.out.println("city "+outer.city);
    }
}
