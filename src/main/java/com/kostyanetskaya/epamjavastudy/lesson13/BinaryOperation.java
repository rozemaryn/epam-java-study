package com.kostyanetskaya.epamjavastudy.lesson13;

public enum BinaryOperation {
     //java: No enum constant javax.lang.model.element.Modifier.SEALED

//    PLUS ("+") {
//        public int calculate(int a, int b) {
//            return a + b;
//        }
//    },
//    MINUS ("-") {
//        public int calculate(int a, int b) {
//            return a - b;
//        }
//    },
//    DIVISION ("/") {
//        public int calculate(int a, int b){
//            return a / b;
//        }
//    },
//    MULT ("*") {
//        public int calculate(int a, int b){
//            return a * b;
//        }
//    };
//
//    private final String operation;
//
//    public abstract int calculate(int a, int b);
//
//    BinaryOperation(String operation) {
//        this.operation = operation;
//    }
//
//    public static void main(String[] args) {
//        int x = 10;
//        int y = 2;
//        for (BinaryOperation op : BinaryOperation.values())
//            System.out.println(x + " " + op.operation + " " + y
//                    + " = " + op.calculate(x, y));
//    }
}

enum Numbers {ONE, TWO, THREE, FOUR, FIVE}
class Quest9 {
    public static void main(String[] args) {
        Numbers n1 = Numbers.ONE;
        Numbers n2 = Numbers.ONE;  //Строка1
        if (n1 == n2) {
            System.out.print ("true");
        } else {
            System.out.print ("false");
        }
        System.out.println( Numbers.FIVE.ordinal() );  //Строка2
    }
}
