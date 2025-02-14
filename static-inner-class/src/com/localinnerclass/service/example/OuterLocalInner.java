package com.localinnerclass.service.example;

public class OuterLocalInner {

    private final String message = "hello from outer class";

    void outerMethod(){
        class LocalInner{
            void printMessage(){
                System.out.println("msg "+message);
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.printMessage();
    }
}
