package com.kostyanetskaya.epamjavastudy.lesson14;

public class WrapperClasses {
    public static void main(String[] args) {
        // It is rarely appropriate to use this constructor. The static factory valueOf(boolean) is generally a better choice,
        // as it is likely to yield significantly better space and time performance. Also consider using
        // the final fields TRUE and FALSE if possible.
        Boolean b = new Boolean("true");
        Boolean b1 = new Boolean("false");
        Boolean b2 = Boolean.valueOf("no true");
        Boolean b3 = Boolean.TRUE;
        Boolean b4 = Boolean.valueOf("tRuE");
        System.out.println(b + ", " + b1 + ", " + b2 + ", " + b3 + ", " + b4);

        boolean b5 = Boolean.parseBoolean("Abc");
        System.out.println(b4);

        System.out.println(b3 && b4);
        System.out.println(Boolean.logicalAnd(b3, b4));
    }
}

class Test {
    public static void main(String[] args) {
        String str = "11";
        int number = Integer.parseInt(str);
        System.out.println(number);
    }
}

class IntegerAndByteDemo {

    public static byte asByte (Number num){
        if (num != null) {
            return num.byteValue();
        }
        return 0;
    }
    public static void main(String[] args) {

        Integer a = 500;
        Integer b = Integer.valueOf(500);

        System.out.println(a == b);         //false
        System.out.println(a.equals(b));    //true

        int primitiveA = a;
        int primitiveB = b.intValue();

        byte b50 = asByte(50);      //50
        byte b500 = asByte(500L);   //-12

        //Integer hex = Integer.parseInt("0xff"); //raises NumberFormatException
        Integer hex1 = Integer.decode("0xff");
        Integer oct = Integer.decode("0377");   //Decodes as 255 (octal)
        Integer dec = Integer.decode("255");

        Integer bin = Integer.parseInt("11111111", 2);

        Integer a2 = Integer.parseInt("255");

        String aString = a2.toString();

        int c = -255;

        String cString = Integer.toString(c);
        String hexString = Integer.toString(c, 16);   //"ff"
        String octString = Integer.toString(c, 8);    //"377"
        String binString = Integer.toUnsignedString(c, 2);    //"11111111111111111111111100000001"
        String bin2String = Integer.toBinaryString(a);

        System.out.println(binString);
    }
}

class BitMethodsExmp {
    public static void main(String[] args) {
        int a = 500; // binary: 111110100

        int highestOneBit = Integer.highestOneBit(a); // 256 : 100000000
        int lowestOneBit = Integer.lowestOneBit(a); // 4 : 100
        int bitCount = Integer.bitCount(a); // 6

        int leadingZeros = Integer.numberOfLeadingZeros(a); // 23

        System.out.println("0".repeat(leadingZeros) + Integer.toBinaryString(a));
        // prints "00000000000000000000000111110100"
    }
}

