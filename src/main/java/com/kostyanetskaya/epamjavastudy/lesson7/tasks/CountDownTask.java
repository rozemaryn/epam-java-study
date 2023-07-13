package com.kostyanetskaya.epamjavastudy.lesson7.tasks;
public class CountDownTask implements Task{

    private int value;

    public CountDownTask(int i) {
        setValue(i);
    }

    @Override
    public void execute() {
        if (value > 0 && !isFinished())
            value--;
    }

    @Override
    public boolean isFinished() {
        return getValue() == 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value > 0) {
            this.value = value;
        } else this.value = 0;
    }

}