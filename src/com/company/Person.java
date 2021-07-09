package com.company;



// Assignment
// Create a class that models a person
// features of the person class: height, gender, complexion, age
// actions: walking, talking, eat, and run.
public class Person {


    // feature of the person class
    private int height = 168;
    private String gender = "female";
    private String complexion = "fair";
    private int age = 28;


    // getters, setters
    // Height
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    // complexion
    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }


    // age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }



    // Actions
    // Walking

    public void walk() {
        if (age > 1) {
            System.out.println("Person is old enough and can walk");
        } else {
            System.out.println("What a cute baby, he's so small and cannot walk yet");
        }
    }

    public void talk() {
        if (gender == "female") {
            System.out.println("The females always talk so much, ha ha. (It is a myth obviously..)");
        } else {
            System.out.println("Man are not very talkative");
        }
    }

    public void eat() {
        if (gender == "male") {
            System.out.println("The man tend to eat a lot, I mean A LOT!");
        } else {
            System.out.println("Girls are always on diet :D");
        }
    }

    public void run() {
        if (height > 170) {
            System.out.println("This person can run faster cause he has longer legs");
        } else {
            System.out.println("Run? More like a jogging person");
        }
    }
}
