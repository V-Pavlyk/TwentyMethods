package com.vitalii.twenty.methods;


import java.util.Arrays;

import static com.vitalii.twenty.methods.TwentyMethods.*;

public class Starter {

    public static final String STRING = "******";
    public static final String STRING_2 = "******\n";

    public static void main(String[] args) {

        System.out.println("Testing my methods");

        /**
         * 1 принимает масив чаров, выводит его на экран.
         */
        System.out.println(STRING);
        System.out.println("1. printCharArrayToConsole");
        TwentyMethods.printCharArrayToConsole(new char[]{'H', 'e', '1', '1', 'o'});
        System.out.println(STRING_2);

        /**
         * 2 принимает массив интов, возвращает массив чаров,
         * каждый символ в позиции массива соответствует коду символа передаваемого инта.
         */
        System.out.println(STRING);
        System.out.println("2. changeCharArrayToIntArray");
        System.out.println(TwentyMethods.getCharsFromInts(new int[]{4, 6}));
        System.out.println(STRING_2);

        /**
         * 3 принимает 2 инта, а и б, возвращает большее из этих 2х чисел.
         */
        System.out.println(STRING);
        System.out.println("3. getMaxOfTwoInts");
        System.out.println(getMaxOfTwoInts(100500, 300));
        System.out.println(STRING_2);


        /**
         * 3.1 принимает 2 инта, а и б, возвращает большее из этих 2х чисел.
         */
        System.out.println(STRING);
        System.out.println("3.1. returnMaxOfTwoIntsWithMath");
        System.out.println(getMaxOfTwoIntsWithMath(32, 23));
        System.out.println(STRING_2);

        /**
         * 3.2.1 принимает 2 инта, а и б, возвращает большее из этих 2х чисел.
         */
        System.out.println(STRING);
        System.out.println("3.2. getMaxOfTwoIntsWithThernary");
        System.out.println(getMaxOfTwoIntsWithThernary(20, 20));
        System.out.println(STRING_2);

        /**
         * 3.2.2 принимает 2 инта, а и б, возвращает большее из этих 2х чисел.
         */
        System.out.println(STRING);
        System.out.println("3.2. getMaxOfTwoIntsWithThernary");
        System.out.println(getMaxOfTwoIntsWithThernary(20, 10));
        System.out.println(STRING_2);

        /**
         * 4 принимает 3 инта, возвращает большее из них.
         */
        System.out.println(STRING);
        System.out.println("4. returnMaxOfThreeInts");
        System.out.println(getMaxOfThreeInts(5, 88, 10));
        System.out.println(STRING_2);

        /**
         * 5 принимает 5 интов, возвращает большее из них.
         */
        System.out.println(STRING);
        System.out.println("5. returnMaxOfFiveIntsWithVarargs");
        System.out.println(getMaxOfFiveIntsWithVarargs(150, 3, 125, 5, 99));
        System.out.println(STRING_2);

        /**
         * 5 принимает 5 интов, возвращает большее из них.
         */
        System.out.println(STRING);
        System.out.println("5. returnMaxOfFiveIntsWithVarargs");
        System.out.println(getMaxOfFiveIntsWithVarargs(150, 3, 125, 5, 99, 1000));
        System.out.println(STRING_2);

        /**
         * 6 принимает массив чаров, возвращает строку состоящую из символов массива.
         */
        System.out.println(STRING);
        System.out.println("6. return StringOfArrayChars");
        System.out.println(getStringOfChars(new char[]{'H', 'e', 'l', 'l', 'o', '!'}));
        System.out.println(STRING_2);

        /**
         * 8 принимает массив интов, и значение типа инт, возвращает индекс массива в котором
         * значение совпадает с передаваемым, начиная с начала массива. Если значения в массиве нет возвращает -1.
         */
        System.out.println(STRING);
        System.out.println("8. returns the index from the beginning of array");
        System.out.println(getIndexFromBeginningOfArray(new int[]{8, 10, 33, 5, 25, 7, 100}, 33));
        System.out.println(STRING_2);


        /**
         * 9 принимает массив интов, и значение типа инт, возвращает индекс массива в котором
         * значение совпадает с передаваемым, начиная с конца массива. Если значения в массиве нет возвращает -1.
         */
        System.out.println(STRING);
        System.out.println("9. returnsTheIndexFromTheEndOfArray");
        System.out.println(getIndexFromEndOfArray(new int[]{1, 99, 150, 6, 41, 11, 29, 53, 32, 1000}, 11));
        System.out.println(STRING_2);

        /**
         * 10 метод принимает инт, и возвращает факториал от заданого инта.
         */
        System.out.println(STRING);
        System.out.println("10. returnFactorialOfTheGivenInt");
        System.out.println(getFactorial(8));
        System.out.println(STRING_2);

        /**
         * 11 принимает инт год, и возвращает тру если год высокосный.
         */
        System.out.println(STRING);
        System.out.println("11. isThisALeapYear");
        System.out.println(isLeapYear(1900));
        System.out.println(STRING_2);

        /**
         * 12 принимает массив интов и число, выводит на екран только елементы массива которые кратны этому числу.
         */
        System.out.println(STRING);
        System.out.println("12. displayMultipleElementsOfArray");
        TwentyMethods.displayMultipleElementsOfArray(new int[]{1, 10, 5, 2, 100, 60, 33, 9, 12}, 3);
        System.out.println(STRING_2);

        /**
         * 13 метод принимает массив интов сортирует его по возрастанию.
         */
        System.out.println(STRING);
        System.out.println("13. sortIntsInAscendingOrder");
        int[] sortedInts = TwentyMethods.sortIntsInAscendingOrder(new int[]{33, 10, 5, 103, 54, 89});
        System.out.println(Arrays.toString(sortedInts));
        System.out.println(STRING_2);

        /**
         * 14 принимает массив байт, если в массиве есть повторяющиеся елементы, возвращает тру.
         */
        System.out.println(STRING);
        System.out.println("14. getTrueIfElementsRepeat");
        System.out.println(hasRepeatedElements(new byte[]{100, 22, 99, 5, 10, 22}));
        System.out.println(STRING_2);

        /**
         * 15 принимает два массива интов одинаковых по длинне, возращает массив интов, который состоит
         * из перемноженных елементов входящих массивов.
         */
        System.out.println(STRING);
        System.out.println("15. getArrayIntsFromMultiplicationOfTwoArrays");
        System.out.println(Arrays.toString(getIntArrayFromMultiplicationOfTwoIntArraysOfTheSameLength(new int[]{100, 22, 99, 5, 10, 22}, new int[]{2, 10, 3, 87, 102, 5})));
        System.out.println(STRING_2);

        /**
         * 16 принимает два массива интов, возвращает массив из елементов, которые не совпадают в массивах.
         */
        System.out.println(STRING);
        System.out.println("16. getDifferentIntFromTwoArrays");
        System.out.println(getDifferentIntFromTwoArrays(new int[]{1,2,3,4,5}, new int[]{1,10,3,4,5,6,7}));
        System.out.println(STRING_2);

        /**
         * 17 принимает масив интов, возвращает его же но в реверсном порядке.
         */
        System.out.println(STRING);
        System.out.println("17. getReverseArray");
        System.out.println(Arrays.toString(reverseInts(new int[]{500, 92, 54, 3, 1035, 21})));
        System.out.println(STRING_2);

        /**
         * 18 принимает 3 инта:
         * - размер выходного массива
         * - нижняя граница
         * - верхняя граница
         * возвращает массив интов заданой длинны, который содержит случайные числа от нижней границы до верхней границы.
         */
        System.out.println(STRING);
        System.out.println("18. getIntArrayByParameters");
        System.out.println(Arrays.toString(getIntArrayByParameters(10, 5, 100)));
        System.out.println(STRING_2);

        /**
         * 19 принимает 2 массива чаров, проверяет есть ли в 1 массиве, такая же последовательность символов,
         * которую представляет собой второй массив. Возвращает булеан.
         */
        System.out.println(STRING);
        System.out.println("19. getTrueIfArraysEquals");
        System.out.println(getTrueIfArraysEquals(new char[]{'H', 'e', 'l', 'l', 'o', '!'}, new char[]{'H', 'e', 'l', 'l', 'o'}));
        System.out.println(STRING_2);
    }
}
