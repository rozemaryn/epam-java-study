package com.kostyanetskaya.epamjavastudy.lesson11;

import java.lang.annotation.*;

public class AnnotationsExamples {
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface BaseAction {
    int level();

    String sqlRequest();
}

@BaseAction(level = 2, sqlRequest = "SELECT name, phone FROM phonebook")
class Base {
    public void doAction() {
        Class clazz = Base.class;
        BaseAction action = (BaseAction) clazz.getAnnotation(BaseAction.class);
        System.out.println(action.level());
        System.out.println(action.sqlRequest());
    }

    public static void main(String[] args) {
        Base b = new Base();
        b.doAction();
    }
}

// аннотация-маркер
@interface MarkerAnnotation {
}

// пример собственной аннотации
@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface TestClass {
}







