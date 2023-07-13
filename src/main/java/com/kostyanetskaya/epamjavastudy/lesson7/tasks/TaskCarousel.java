package com.kostyanetskaya.epamjavastudy.lesson7.tasks;

import java.util.ArrayList;

public class TaskCarousel {
    private ArrayList<Task> tasks;
    int capacity;
    int executeCounter;

    public TaskCarousel(int capacity) {
        this.tasks = new ArrayList<>(capacity);
        this.capacity = capacity;
    }

    public boolean addTask(Task task) {
        isEmpty();
        if (isFull() || task.isFinished()) {
            return false;
        }
        tasks.add(task);
        return true;
    }

    public boolean execute() {
        if (isEmpty()) {
            return false;
        }
        if (executeCounter == tasks.size()) {
            executeCounter = 0;
        }

        Task runningTask = tasks.get(executeCounter);

        if (!runningTask.isFinished()) {
            runningTask.execute();
            executeCounter++;
            return true;
        }

        if (runningTask.isFinished()) {
            tasks.remove(runningTask);
            executeCounter++;
            return false;
        }
        return false;
    }

    public boolean isFull() {
        return tasks.size() == capacity;
    }

    public boolean containsIsFinished () {
        for (Task t: tasks) {
            if (t.isFinished())
                return true;
        }
        return false;
    }

    public boolean isEmpty() {
        // if (executeCounter == tasks.size()) {
        while (containsIsFinished())
            for (int i = 0; i < tasks.size(); i++) {
                if (tasks.get(i).isFinished()) {
                    tasks.remove(tasks.get(i));
                    executeCounter--;
                }
            }

        return tasks.isEmpty();
    }

    public static void main(String[] args) {
        TaskCarousel carousel = new TaskCarousel(3);

        CountDownTask task1 = new CountDownTask(2);
        CountDownTask task2 = new CountDownTask(2);
        CompleteByRequestTask task3 = new CompleteByRequestTask();

        System.out.println(carousel.addTask(task1)); //true
        System.out.println(carousel.addTask(task2)); //true
        System.out.println(carousel.addTask(task3)); //true

        System.out.println(carousel.isFull()); // true
        System.out.println("___________________________________");

        for (int i = 0; i < 10; i++) {
            System.out.println(carousel.execute()); // true
        }
        System.out.println("___________________________________");

        System.out.println(task1.isFinished()); // true
        System.out.println(task2.isFinished()); // true
        System.out.println(task3.isFinished()); // false
        System.out.println("___________________________________");

        task3.complete();

        System.out.println(task3.isFinished()); // false
        System.out.println(carousel.execute()); // true
        System.out.println(task3.isFinished()); // true

        System.out.println(carousel.isEmpty()); // true
    }
}