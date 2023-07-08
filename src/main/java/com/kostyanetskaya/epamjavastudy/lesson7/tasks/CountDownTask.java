package com.kostyanetskaya.epamjavastudy.lesson7.tasks;

interface Task {
    boolean execute();
}

public class CountDownTask implements Task {
    private int startValue;
    private int result;

    CountDownTask(int i) {
        setStartValue(i);
    }

    @Override
    public boolean execute() {
        if (startValue > 0)
            result = startValue--;
        // Если задача инициализирована с нулевым значением, считайте ее завершенной сразу после создания.
        return true;
    }

    public int getStartValue() {
        return startValue;
    }

    public void setStartValue(int startValue) {
        if (startValue > 0) {
            this.startValue = startValue;
        } else this.startValue = 0;
    }

    public int getResult() {
        return result;
    }
}
