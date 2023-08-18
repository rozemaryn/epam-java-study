package com.kostyanetskaya.epamjavastudy.lesson12;

public class GenericMethods {
}

class GenericMethod {
    public static <T> byte asByte(T num) {
        if (num instanceof Number) {
            return ((Number) num).byteValue();
        }
        return 0;
    }

    public static void main(String[] args) {
        Byte b = GenericMethod.asByte(234.5);
        System.out.println(b);

        System.out.println(GenericMethod.asByte(Integer.valueOf(7)));
        System.out.println(GenericMethod.asByte(Float.valueOf(7.0F)));
        System.out.println(GenericMethod.asByte(Character.valueOf('7')));
    }
}

class Box <T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public static <V> Box <V> box(V value) {
        return new Box < > (value);
    }
}

class BoxProvider {
    public <T> Box <T> box(T value) {
        return new Box < > (value);
    }
}

class Main {
    public static void main(String[] args) {
        Box <String> box1 = Box.<String> box("1"); // a box with String
        Box <Integer> box2 = new BoxProvider(). < Integer > box(2); // a box with Integer
    }
}
