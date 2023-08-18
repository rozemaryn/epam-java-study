package com.kostyanetskaya.epamjavastudy.lesson13;

public enum Operation {
    //java: No enum constant javax.lang.model.element.Modifier.SEALED
//    PLUS {
//        double eval(double x, double y) {
//            return x + y;
//        }
//    },
//    MINUS {
//        double eval(double x, double y) {
//            return x - y;
//        }
//    },
//    TIMES {
//        double eval(double x, double y) {
//            return x * y;
//        }
//    },
//    DIVIDED_BY {
//        double eval(double x, double y) {
//            return x / y;
//        }
//    };
//
//    abstract double eval(double x, double y);
//
//    public static void main(String[] args) {
//        double x = 2.0;
//        double y = 4.0;
//        for (Operation op : Operation.values())
//            System.out.println(x + " " + op + " " + y
//                    + " = " + op.eval(x, y));
//    }
}

enum PrinterType {

    DOTMATRIX(5),
    INKJET(10),
    LASER(50);

    private int pagePrintCapacity;
    private PrinterType(int pagePrintCapacity)  {
        this.pagePrintCapacity = pagePrintCapacity;
    }
    public int getPrintPageCapacity() {
        return pagePrintCapacity;
    }
}
