package com.kostyanetskaya.epamjavastudy.lesson6.prima;

public class AnotherPerson {
    private int id;
    private String name = "";
    public AnotherPerson() {
        super();
    }

    public AnotherPerson(int id) {
        this.id = id;
    }

    public AnotherPerson(String name) {
        this.name = name;
    }

    public AnotherPerson(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
