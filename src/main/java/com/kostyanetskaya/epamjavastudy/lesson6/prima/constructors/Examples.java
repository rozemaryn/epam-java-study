package com.kostyanetskaya.epamjavastudy.lesson6.prima.constructors;

public class Examples {
}

class Cat {
    Cat() {
        System.out.println("Cat default constructor");
    }
    Cat(String name) {
        System.out.println("Cat constructor " + name);
    }
}
class BritishCat extends Cat {
    BritishCat(String name) {
        System.out.println("British constructor");
    }
}
class Main {
    public static void main(String[] arg) {
        BritishCat Cat = new BritishCat("Mulberry");
    }
}

class Boy  {
    private int age = 19;
    private String name = "Michael";
    public static void main(String[] args) {
        Boy b = new Boy();
        String result = b.toString();
        System.out.println(result);
    }
    public String toString() {
        return name + " is " + age + " years old";
    }
}

class Person {
    String version = "Person";
}
class Student extends Person {
    String version = "Student";
}
class Main3 {
    public static void main(String[] args) {
        Person person = new Student ();
        System.out.println(person.version);
    }
}

class Person2 {
    String name;
}
class SuperMan extends Person2 {
    String skills;
    SuperMan(String skills, String name) {
        super();
        this.skills = skills;
    }
    public String showInfo() {
        return name + " has " + skills;
    }
}
class Main4 {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan("super vision", "Clark Kent");
        System.out.print(superMan.showInfo());
    }
}

