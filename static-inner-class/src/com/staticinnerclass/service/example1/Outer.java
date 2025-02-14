package com.staticinnerclass.service.example1;

public class Outer {

    public String city;

//    public void printData(){
//        System.out.println("city "+ city);
//    }

    static class Inner{

        public String state;
        public String country;

        public void printData(){
            System.out.println("state " + state +" "+ "country " +  country);
        }
    }

}


