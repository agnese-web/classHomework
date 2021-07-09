package com.company;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("This person is "+ person.getAge() + " years old.");
        System.out.println("This person is a " + person.getGender() + ".");
        System.out.println("This person has " + person.getComplexion() + " complexion.");
        System.out.println("This person is " + person.getHeight() + " cm long.");

        person.walk();
        person.talk();
        person.eat();
        person.run();

        
    }
}
