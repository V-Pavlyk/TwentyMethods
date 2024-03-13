package com.vitalii.twenty.methods;


import static com.vitalii.twenty.methods.TwentyMethods.*;

public class Starter {

    public static final String STRING = "******";
    public static final String STRING2 = "******\n";

    public static void main(String[] args) {

        System.out.println("Testing my methods");

        /**
         * 1 принимает масив чаров, выводит его на экран
         */
        System.out.println(STRING);
        System.out.println("1. printCharArrayToConsole");
        TwentyMethods.printCharArrayToConsole(new char[]{'H', 'e', '1', '1', 'o'});
        System.out.println(STRING);
        TwentyMethods.printCharArrayToConsole(new char[]{});
        System.out.println(STRING);

        /**
         * 2 принимает массив интов, возвращает массив чаров,
         * каждый символ в позиции массива соответствует коду символа передаваемого инта
         */
        System.out.println("2. changeCharArrayToIntArray");
        System.out.println(TwentyMethods.modifyCharArrayToIntArray(new int[]{4, 6}));
        System.out.println(STRING);
        System.out.println(TwentyMethods.modifyCharArrayToIntArray(new int[]{}));
        System.out.println(STRING);

        /**
         * 3 принимает 2 инта, а и б, возвращает большее из этих 2х чисел.
         */
        System.out.println("3. returnMaxOfTwoInts");
        System.out.println(returnMaxOfTwoInts(100500, 300));
        System.out.println(STRING2);


        /**
         * 3.1 принимает 2 инта, а и б, возвращает большее из этих 2х чисел.
         */
        System.out.println(STRING);
        System.out.println("3.1. returnMaxOfTwoIntsWithMath");
        System.out.println(returnMaxOfTwoIntsWithMath(32, 23));
        System.out.println(STRING2);

        /**
         * 3.2 принимает 2 инта, а и б, возвращает большее из этих 2х чисел.
         */
        System.out.println(STRING);
        System.out.println("3.2. returnMaxOfTwoIntsWithThernary");
        System.out.println(returnMaxOfTwoIntsWithThernary(20, 10));
        System.out.println(STRING2);

        /**
         * 4 принимает 3 инта, возвращает большее из них
         */
        System.out.println(STRING);
        System.out.println("4. returnMaxOfThreeInts");
        System.out.println(returnMaxOfThreeInts(5, 88, 10));
        System.out.println(STRING2);

        /**
         * 5 принимает 5 интов, возвращает большее из них
         */
        System.out.println(STRING);
        System.out.println("5. returnMaxOfFiveIntsWithVarargs");
        System.out.println(returnMaxOfFiveIntsWithVarargs(2, 3, 125, 5, 99));
        System.out.println(STRING2);

        /**
         * 6 принимает массив чаров, возвращает строку состоящую из символов массива
         */
        System.out.println(STRING);
        System.out.println("6. return StringOfArrayChars");
        System.out.println(returnStringOfArrayChars(new char[]{'H', 'e', 'l', 'l', 'o', '!'}));
        System.out.println(STRING2);

        /**
         * 8 принимает массив интов, и значение типа инт, возвращает индекс массива в котором
         * значение совпадает с передаваемым, начиная с начала массива. Если значения в массиве нет возвращает -1
         */
        System.out.println(STRING);
        System.out.println("8. returns the index from the beginning of array");
        System.out.println(returnsIndexFromBeginningOfArray(new int[]{8, 10, 33, 5, 25, 7, 100}, 33));
        System.out.println(STRING2);


        /**
         * 9 принимает массив интов, и значение типа инт, возвращает индекс массива в котором
         * значение совпадает с передаваемым, начиная с конца массива. Если значения в массиве нет возвращает -1
         */
        System.out.println(STRING);
        System.out.println("9. returnsTheIndexFromTheEndOfArray");
        System.out.println(returnsIndexFromEndOfArray(new int[]{1, 99, 150, 6, 41, 11, 29, 53, 32, 1000}, 11));
        System.out.println(STRING2);

        /**
         * 10 метод принимает инт, и возвращает факториал от заданого инта
         */
        System.out.println(STRING);
        System.out.println("10. returnFactorialOfTheGivenInt");
        System.out.println(returnFactorial(8));
        System.out.println(STRING2);

        /**
         * 11 принимает инт год, и возвращает тру если год высокосный
         */
        System.out.println(STRING);
        System.out.println("IsThisALeapYear");
        System.out.println(IsThisLeapYear(1900));
        System.out.println(STRING2);

        /**
         * 12 принимает массив интов и число, выводит на екран только елементы массива которые кратны этому числу
         */
        System.out.println(STRING);
        System.out.println("displaysMultipleElementsOfArray");
        TwentyMethods.displaysMultipleElementsOfArray(new int[]{1, 10, 5, 2, 100, 60, 33, 9, 12}, 3);
        System.out.println(STRING2);
    }
}
