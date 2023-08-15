package com.kostyanetskaya.epamjavastudy.lesson11;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Arrays;

public class UserAnnotation {
    enum SecurityLevelType {
        LOW, MEDIUM, HIGH
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface BankingAnnotation {
        SecurityLevelType securityLevel() default SecurityLevelType.MEDIUM;
    }
    class AccountManagerImpl {
        @BankingAnnotation(securityLevel = SecurityLevelType.HIGH)
        public double depositInCash(int accountId, int amount) {
            System.out.println("deposit in total: " + amount );
            return 0;
        }
        @BankingAnnotation(securityLevel = SecurityLevelType.HIGH)
        public boolean withdraw(int accountId, int amount) {
            System.out.println("amount withdrawn: " + + amount);
            return true;
        }

        @BankingAnnotation(securityLevel = SecurityLevelType.LOW)
        public boolean convert(double amount) {
            System.out.println("amount converted: " + amount);
            return true;
        }
        @BankingAnnotation // default value MEDIUM
        public boolean transfer(int accountId, double amount) {
            System.out.println("amount transferred: " + amount);
            return true;
        }
    }
}

class SecurityService {
    public void onInvoke(UserAnnotation.SecurityLevelType level, Method method, Object[] args){
        System.out.printf("%s() was invoked with parameters: %s ",
                method.getName(), Arrays.toString(args));
        switch (level) {
            case LOW -> System.out.println("security: " + level);
            case MEDIUM -> System.out.println("security: " + level);
            case HIGH -> System.out.println("security: " + level);
            default -> throw new EnumConstantNotPresentException(
                    UserAnnotation.SecurityLevelType.class, level.toString());
        }
    }
}
