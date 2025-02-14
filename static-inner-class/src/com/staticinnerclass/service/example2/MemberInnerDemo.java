package com.staticinnerclass.service.example2;

public class MemberInnerDemo {

    public static void main(String[] args) {

    ParentOuter parentOuter = new ParentOuter();
    ParentOuter.MemberInner  memberInner = parentOuter.new MemberInner();

    memberInner.printMessage();

    }

}
