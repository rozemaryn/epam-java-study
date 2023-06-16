package com.kostyanetskaya.epamjavastudy.lesson5;

public class ExamplesFromLesson {
    public static void start(int number) {
        System.out.println("Old value of \"number\" into \"start\" method is:" + number);
        number = 3;
        System.out.println("New value of \"number\" into \"start\" method is:" + number);
    }
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Old value of \"number\" into \"main\" method is:" + number);
        start(number);
        System.out.println("New value of \"number\" into \"main\" method is:" + number);
    }
}

class Cat {
    private boolean collarStatus = false;
    public boolean getCollarStatus() {
        return collarStatus;
    }
    public void setCollarStatus(boolean status) {
        collarStatus = status;
    }
}

class Main {
    public static void concat (Cat cat) {
        System.out.println("Old value of \"collarStatus\" into \"concat\" method is:" + cat.getCollarStatus());
        cat.setCollarStatus(true);
        System.out.println("Old value of \"collarStatus\" into \"concat\" method is:" + cat.getCollarStatus());
    }
    public static void main(String[] args) {
        Cat kitty = new Cat();
        System.out.println("Old value of \"collarStatus\" into \"main\" method is:" + kitty.getCollarStatus());
        concat(kitty);
        System.out.println("Old value of \"collarStatus\" into \"main\" method is:" + kitty.getCollarStatus());
    }
}

class VarArg {
    public int calcSum(int... values) {
        int res = 0;
        for (int x : values) {
            res += x;
        }
        return res;
    }
}
class TestArgVar {
    public static void main(String[] arg) {
        VarArg tstvarg = new VarArg();
        System.out.println(tstvarg.calcSum());
        System.out.println(tstvarg.calcSum(3));
        System.out.println(tstvarg.calcSum(55, 66));
        System.out.println(tstvarg.calcSum(77, 55, 33, 11, 99));
    }
}

class Test {
    void doIt () { }
    // null doIt() { }

    byte doThat () { return 1; }

    public static void main(String[] args) {
        Test test = new Test();
        test.doIt();
    }

}
