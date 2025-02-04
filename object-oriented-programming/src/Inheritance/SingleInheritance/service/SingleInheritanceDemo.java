package Inheritance.SingleInheritance.service;

public class SingleInheritanceDemo {

    public static void main(String[] args) {
        DogService dogService = new DogService();

        dogService.makeSound();  // parent methods

        dogService.bark();   // own methods
    }
}
