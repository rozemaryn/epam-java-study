package com.kostyanetskaya.epamjavastudy.lesson15;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        int[] ints = {};
        IntService service = new IntService();
//        double avg = service.average(ints);
//        System.out.println(avg);

        Optional<Double> optionalDouble = service.averageOpt(ints);
        optionalDouble.ifPresent(System.out::println);

        if (optionalDouble.isEmpty()) {
            System.out.println("Array is empty");
        }
        Double res1 = optionalDouble.orElse(Double.NaN);
        System.out.println(res1);

        Double res2 = optionalDouble.orElseThrow();

    }
}

class Examples {
    public static void main(String[] args) {

        Optional<Object> name = Optional.of("John");
        System.out.println(name.orElseGet(String::new));

        Optional empty = Optional.empty();
        Object emptyValue = empty.orElseThrow();
    }
}
