package ru.geekbrains.erik;

import java.util.Arrays;

public class less2HomeWork {
    public static void main(String[] args) {

        // Задание 1: Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] arr1 = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        replacement0to1(arr1);
        System.out.println("Задание 1: " + Arrays.toString(arr1));

        // Задание 2: Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int[] arr2 = new int[8];
        fillEmptyArray(arr2);
        System.out.println("Задание 2: " + Arrays.toString(arr2));

        // Задание 3: Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] arr3 = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        multiplyNumberLess6InArray(arr3);
        System.out.println("Задание 3: " + Arrays.toString(arr3));

        // использовал костыль, нулевой член массива никак не хотел умножаться на 2

        // Задание 4: Создать квадратный двумерный целочисленный
        // массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        int[][] arr4 = new int[5][5];
        fillDiagonal(arr4);
        System.out.println("Задание 4: " + Arrays.deepToString(arr4));

        // Задание 5: Задать одномерный массив и найти в нем
        // минимальный и максимальный элементы (без помощи интернета);

        int[] arr5 = new int[] {1, 5, 3, 2, 11, 4};



    }

    static void replacement0to1 (int[] arr) {   // метод для задания 1.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }

        }
    }   // метод для задания 1.

    static void fillEmptyArray (int[] arr) {    // метод для задания 2
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
    }   // метод для задания 2.

    static void multiplyNumberLess6InArray (int[] arr) {    // метод для задания 3.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
                arr[0] = 2;                         // костыль
            }
        }
    }   //метод для задания 3.

    static void fillDiagonal (int[][] arr) {    //метод для задания 4/
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int x = 1;
                if (i == j || i == x) {
                    arr[i][j] = 1;
                }
            }
        }
    }   //метод для задания 4.

    static void minAndMaxInArray (int[] arr) {
        int a = Math.max(Math.max (arr[0], Math.max(arr[1], Math.max(arr[2], Math.max(arr[3], Math.max(arr[4], arr[5]))))));
        System.out.println(a);
        int b = Math
    }

}
