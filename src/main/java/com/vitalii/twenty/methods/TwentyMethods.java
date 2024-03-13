package com.vitalii.twenty.methods;

public class TwentyMethods {

    /**
     * 1 принимает массив чаров, выводит его на экран
     */
    public static void printCharArrayToConsole(char[] chars) {
        System.out.println(chars);
    }

    /**
     * 2 принимает массив интов, возвращает массив чаров,
     * каждый символ в позиции массива соответствует коду символа передаваемого инта
     */
    public static char[] modifyCharArrayToIntArray(int[] ints) {
        char[] chars = new char[ints.length];
        for (int i = 0; i < ints.length; i++) {
            chars[i] = (char) ints[i];
        }
        return chars;
    }

    /**
     * 3 принимает 2 инта, а и б, возвращает большее из этих 2х чисел.
     */
    public static int returnMaxOfTwoInts(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    /**
     * 3.1 принимает 2 инта, а и б, возвращает большее из этих 2х чисел
     */
    public static int returnMaxOfTwoIntsWithMath(int c, int d) {
        return Math.max(c, d);
    }

    /**
     * 3.2 принимает 2 инта, а и б, возвращает большее из этих 2х чисел
     */
    public static int returnMaxOfTwoIntsWithThernary(int a, int b) {
        return (a > b) ? a : b;
    }

    /**
     * 4 принимает 3 инта, возвращает большее из них
     */
    public static int returnMaxOfThreeInts(int a, int b, int c) {
        int tempMax = returnMaxOfTwoInts(a, b);
        return returnMaxOfTwoInts(tempMax, c);
    }

    /**
     * 5 принимает 5 интов, возвращает большее из них
     */
    public static int returnMaxOfFiveIntsWithVarargs(int... nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * 6 принимает массив чаров, возвращает строку состоящую из символов массива
     */
    public static String returnStringOfArrayChars(char[] array) {
        return new String(array);
    }

    /**
     * 8 принимает массив интов, и значение типа инт, возвращает индекс массива в котором
     * значение совпадает с передаваемым, начиная с начала массива. Если значения в массиве нет возвращает -1
     */
    public static int returnsIndexFromBeginningOfArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 9 принимает массив интов, и значение типа инт, возвращает индекс массива в котором
     * значение совпадает с передаваемым, начиная с конца массива. Если значения в массиве нет возвращает -1
     */
    public static int returnsIndexFromEndOfArray(int[] array, int value) {
        for (int i = array.length - 1; i >= 1; i--) {
            if (value == array[i]) {
                return i;
            }

        }
        return -1;
    }

    /**
     * 10 метод принимает инт, и возвращает факториал от заданого инта
     */
    public static int returnFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    /**
     * 11 принимает инт год, и возвращает тру если год высокосный
     */
    public static boolean IsThisLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    /**
     * 12 принимает массив интов и число, выводит на екран только елементы массива которые кратны этому числу
     */
    public static void displaysMultipleElementsOfArray(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % num == 0) {
                System.out.println(array[i]);
            }
        }
    }
}


