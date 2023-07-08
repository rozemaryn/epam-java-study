package com.kostyanetskaya.epamjavastudy.lesson7;

public record Item (int itemId, String name) {

    }

    class ItemMain {
        public static void main(String[] args) {
            Item i1 = new Item(77, "Lucky");
            System.out.println(i1.itemId() + "" + i1.name() + "" + i1);

            Item i2 = new Item(77, "Lucky");
            System.out.println((i1==i2) + " " + i1.equals(i2));
            System.out.println(i1.hashCode() == i2.hashCode());
        }
    }

