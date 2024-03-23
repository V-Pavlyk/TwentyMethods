package com.vitalii.twenty.methods;

import java.util.Arrays;

public class TwentyMethods {

    /**
     * 1 принимает массив чаров, выводит его на экран.
     */
    public static void printCharArrayToConsole(char[] chars) {
        System.out.println(chars);
    }

    /**
     * 2 принимает массив интов, возвращает массив чаров,
     * каждый символ в позиции массива соответствует коду символа передаваемого инта.
     */
    public static char[] getCharsFromInts(int[] ints) {
        char[] chars = new char[ints.length];
        for (int i = 0; i < ints.length; i++) {
            chars[i] = (char) ints[i];
        }
        return chars;
    }

    /**
     * 3 принимает 2 инта, а и б, возвращает большее из этих 2х чисел.
     */
    public static int getMaxOfTwoInts(int firstInt, int secondInt) {
        if (firstInt > secondInt) {
            return firstInt;
        }
        return secondInt;
    }

    /**
     * 3.1 принимает 2 инта, а и б, возвращает большее из этих 2х чисел.
     */
    public static int getMaxOfTwoIntsWithMath(int firstInt, int secondInt) {
        return Math.max(firstInt, secondInt);
    }

    /**
     * 3.2 принимает 2 инта, а и б, возвращает большее из этих 2х чисел.
     */
    public static int getMaxOfTwoIntsWithThernary(int firstInt, int secondInt) {
        return (firstInt > secondInt) ? firstInt : secondInt;
    }

    /**
     * 4 принимает 3 инта, возвращает большее из них.
     */
    public static int returnMaxOfThreeInts(int a, int b, int c) {
        int tempMax = getMaxOfTwoInts(a, b);
        return getMaxOfTwoInts(tempMax, c);
    }

    /**
     * 5 принимает 5 интов, возвращает большее из них.
     */
    public static int returnMaxOfFiveIntsWithVarargs(int... nums) {
        if (nums.length != 5) {
            System.out.println("Array length is not 5");
        }
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * 6 принимает массив чаров, возвращает строку состоящую из символов массива.
     */
    public static String returnStringOfArrayChars(char[] array) {
        return new String(array);
    }

    /**
     * 8 принимает массив интов, и значение типа инт, возвращает индекс массива в котором
     * значение совпадает с передаваемым, начиная с начала массива. Если значения в массиве нет возвращает -1.
     */
    public static int getIndexFromBeginningOfArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 9 принимает массив интов, и значение типа инт, возвращает индекс массива в котором
     * значение совпадает с передаваемым, начиная с конца массива. Если значения в массиве нет возвращает -1.
     */
    public static int getIndexFromEndOfArray(int[] array, int value) {
        for (int i = array.length - 1; i >= 1; i--) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 10 метод принимает инт, и возвращает факториал от заданого инта.
     */
    public static int returnFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    /**
     * 11 принимает инт год, и возвращает тру если год высокосный.
     */
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    /**
     * 12 принимает массив интов и число, выводит на екран только елементы массива которые кратны этому числу.
     */
    public static void displayMultipleElementsOfArray(int[] array, int num) {
        for (int j : array) {
            if (j % num == 0) {
                System.out.println(j);
            }
        }
    }

    /**
     * 13 метод принимает массив интов сортирует его по возрастанию.
     */
    public static void sortArrayAscend(int[] array) {
        Arrays.sort(array);
        for (int values : array) {
            System.out.println(values);
        }
    }

    /**
     * 14 принимает массив байт, если в массиве есть повторяющиеся елементы, возвращает тру.
     */
    public static boolean getTrueIfElementRepeat(byte[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 15 принимает два массива интов одинаковых по длинне, возращает массив интов, который состоит
     * из перемноженных елементов входящих массивов.
     */
    public static int[] getArrayIntsFromMultiplicationOfTwoArrays(int[] firstArray, int[] secondArray) {
        int[] result = new int[firstArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            result[i] = firstArray[i] * secondArray[i];
        }
        return result;
    }

    /**
     * 16 принимает два массива интов, возвращает массив из елементов, которые не совпадают в массивах
     */

    /**
     * 17 принимает масив интов, возвращает его же но в реверсном порядке
     */
    public static int[] getReverseArray(int[] array) {
        for (int i = 0; array != null && i < array.length / 2; i++) {
            int tempValue = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tempValue;
        }
        return array;
    }

    /**
     * принимает 3 инта:
     * - размер выходного массива
     * - нижняя граница
     * - верхняя граница
     * возвращает массив интов заданой длинны, который содержит случайные числа от нижней границы до верхней границы.
     */
    public static int[] getIntArrayByParameters(int length, int min, int max) {
        int[] result;
        result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = (int) (Math.random() * (max - min) + min);
        }
        return result;
    }

    /**
     * принимает 2 массива чаров, проверяет есть ли в 1 массиве, такая же последовательность символов,
     * которую представляет собой второй массив. Возвращает булеан.
     */
    public static boolean getTrueIfArraysEquals(char[] firstArray, char[] secondArray) {
        final boolean equals;
        equals = Arrays.equals(firstArray, secondArray);
        return equals;
    }
}


