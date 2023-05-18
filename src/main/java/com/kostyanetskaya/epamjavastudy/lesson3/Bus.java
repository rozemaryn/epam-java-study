package com.kostyanetskaya.epamjavastudy.lesson3;

public class Bus {
    private int id = 1;
    final static int COUNTER;
    {
        ++id;
        System.out.println(id);
    }
    static {
    COUNTER = Integer.parseInt("177");
        System.out.println("static block " + COUNTER);
    }

    public Bus(int id) {
        this.id = id;
    }

    public Bus(){

    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                '}';
    }
}
