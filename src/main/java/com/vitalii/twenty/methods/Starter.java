package com.vitalii.twenty.methods;


import static com.vitalii.twenty.methods.TwentyMethods.returnMaxOfTwoInts;

public class Starter {

    public static final String STRING = "******";

    public static void main(String[] args) {

        System.out.println("Testing my methods");

        //1 принимает масив чаров, выводит его на экран
        System.out.println("1. printCharArrayToConsole");
        TwentyMethods.printCharArrayToConsole(new char[]{'H', 'e', '1', '1', 'o'});
        System.out.println(STRING);
        TwentyMethods.printCharArrayToConsole(new char[]{});
        System.out.println(STRING);

        //2 принимает массив интов, возвращает массив чаров,
        //каждый символ в позиции массива соответствует коду символа передаваемого инта
        System.out.println("2 changeCharArrayToIntArray");
        System.out.println(TwentyMethods.modifyCharArrayToIntArray(new int[]{4, 6}));
        System.out.println(STRING);
        System.out.println(TwentyMethods.modifyCharArrayToIntArray(new int[]{}));
        System.out.println(STRING);

        //3 приминает 2 инта, а и б, возвращает большее из этих 2х чисел.

        System.out.println(returnMaxOfTwoInts(100500,300));



    }




}