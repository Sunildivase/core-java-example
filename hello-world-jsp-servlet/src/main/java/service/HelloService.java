package service;


public class HelloService {

    public String greet(String name){
        if(name.isBlank()){
            return "hello world!!!";
        }return "hello" + name;


    }
}
