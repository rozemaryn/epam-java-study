package com.kostyanetskaya.epamjavastudy.lesson9;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.capacity());
        System.out.println(builder.length());

        builder.append("hello");
        System.out.println(builder.capacity());
        System.out.println(builder.length());

        builder.insert(2, "somelonglongword");
        System.out.println(builder.capacity());
        System.out.println(builder.length());

        System.out.println(builder.delete(10, 15));
        System.out.println(builder.reverse());
    }
}

class Demo2 {
    public static void main(String[] args) {
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        builder1.append("java");
        builder2.append(builder1);
        System.out.println(builder1.equals(builder2));
        System.out.println(builder1.hashCode() == builder2.hashCode());

        System.out.println(builder1.toString().contentEquals(builder2));

    }
}
