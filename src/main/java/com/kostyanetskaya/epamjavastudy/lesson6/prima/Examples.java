package com.kostyanetskaya.epamjavastudy.lesson6.prima;
import java.util.ArrayList;

public class Examples {
}

class Person {
    private final ArrayList friends = new ArrayList<>();
    public ArrayList getFriends() {
        return friends;
    }
    public void addFriend(Person friend) {
        friends.add(friend);
    }
}
class Main {
    public static void main(String[] args) {
        Person man1 = new Person();
        Person man2 = new Person();
        Person man3 = new Person();
        man3.addFriend(man1);
        man3.addFriend(man2);
        System.out.println(man3.getFriends());
    }
}


