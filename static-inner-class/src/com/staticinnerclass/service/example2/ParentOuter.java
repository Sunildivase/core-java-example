package com.staticinnerclass.service.example2;

public class ParentOuter {

    private String message ="hello from parent outer class!!";


     class MemberInner{

        void printMessage(){
            System.out.println("msg "+message);
        }
    }
}
