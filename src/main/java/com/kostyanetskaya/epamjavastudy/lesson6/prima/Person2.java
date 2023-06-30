package com.kostyanetskaya.epamjavastudy.lesson6.prima;

public class Person2 {

    private String name;
    private int age;

    public Person2(String name, int age) {
        checkName(name);
        checkAge(age);

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        checkName(name);
        this.name = name;
    }

    public void incrementAge() {
        this.age++;
    }

    private void checkAge(final int age) {
        if (age < 0){
            throw new IllegalArgumentException("Age is negative");
        }
    }

    private void checkName(final String name) {
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Name is null or empty");
        }
    }
}
