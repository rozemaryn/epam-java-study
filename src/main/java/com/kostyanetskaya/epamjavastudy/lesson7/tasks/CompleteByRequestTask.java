package com.kostyanetskaya.epamjavastudy.lesson7.tasks;

public class CompleteByRequestTask implements Task {
    private boolean isComplete = false;
    private boolean isFinished = false;


    public CompleteByRequestTask() {
    }

    @Override
    public void execute() {
        if (!isFinished()) {
            System.out.println("CompleteByRequestTask executed");
            isFinished = isComplete;
        }
    }

    @Override
    public boolean isFinished() {
        return isFinished;
    }

    public void complete() {
        System.out.println("Method complete run");
        isComplete = true;
    }
}

