package ru.geekbrains.erik;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class less3HomeWork {
    public static void main(String[] args) {



        gameOne();
        System.out.println("Игра окончена");
        playAgainGameOne();
        System.out.println("Игра окончена");
        playAgainGameOne();
        System.out.println("Игра окончена");
        playAgainGameOne();
        System.out.println("Игра окончена");


    }

    static void gameOne() {                              //Основной метод для первой задачи
        String insert = "Введите число от 0 до 9";
        System.out.println(insert);
        Random rand = new Random();
        int r = rand.nextInt(10);
        for (int i = 0; i < 3; i++) {
            Scanner scan = new Scanner(System.in);
            int s = scan.nextInt();
            if (s < r) {
                System.out.println("Введенное число меньше загаданного");
            } else if (s > r) {
                System.out.println("Введенное число больше загаданного");
            } else if (s == r) {
                System.out.println("Поздравляю, Вы угадали число!");
                break;
            }
        }
    }          //Основной метод для первой задачи

    static void playAgainGameOne() {                         //метод, предлагающий сыграть еще раз

        System.out.println("Введите 1 чтобы сыграть еще раз, или 0 чтобы закончить");

        Scanner scan2 = new Scanner(System.in);
        int g = scan2.nextInt();

        if (g == 1) {
            gameOne();
        } else {
            System.out.println("Спасибо что сыграли в мою игру!");
        }

    }   //метод, предлагающий сыграть еще раз



    //Не осилил задачу со звездочкой, порешаю утром еще.



//    static void gameTwo() {
//        String[] arr = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//        int p = (int) Math.floor(Math.random() * arr.length);
//        String randomWord = arr[p];             //Загадал случайное число из массива выше
//        int x = randomWord.length();
//
//        System.out.println("Угадайте, какое слово я загадал из списка:");
//
//        System.out.println(Arrays.toString(arr));
//        //System.out.println("В загаданном слове " + x + " букв");
//
//        Scanner scan3 = new Scanner(System.in);
//        String word = scan3.nextLine();
//
//            if (word == randomWord) {
//                System.out.println("Вы угадали");
//                 } else if (word != randomWord) {
//                    for (int i = 0; i < x; i++) {
//                            if (word.charAt(i) == randomWord.charAt(i)) {
//                                System.out.print(i);
//                    } else {
//                            System.out.print("####");
//                }
//            }
//        } else {
//
//
//        }
//    }
}
