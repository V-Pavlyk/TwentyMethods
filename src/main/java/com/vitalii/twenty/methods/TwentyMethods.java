package com.vitalii.twenty.methods;

public class TwentyMethods {

    //1 принимает масив чаров, выводит его на экран
    public static void printCharArrayToConsole(char[] chars) {
        System.out.println(chars);
    }

    //2 принимает массив интов, возвращает массив чаров,
    //каждый символ в позиции массива соответствует коду символа передаваемого инта
    public static char[] modifyCharArrayToIntArray(int[] ints) {
        char[] chars = new char[ints.length];
        for (int i = 0; i < ints.length; i++) {
            chars[i] = (char) ints[i];
        }
        return chars;
    }

    //3 приминает 2 инта, а и б, возвращает большее из этих 2х чисел
    public static int returnMaxOfTwoInts(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
}
