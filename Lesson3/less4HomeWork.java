package ru.geekbrains.erik;

import java.io.Console;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class less4HomeWork {

    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_PLAYER = 'X';
    public static final char DOT_AI = '0';
//    public static char DOT_PLAYER;        //Пытался разблокировать переменные, чтобы работал метод выбора фишки
//    public static char DOT_AI;


    public static void main(String[] args)  {


        //chooseCap();    //выбор фишки
        inintMap();     //инициализация карты
        printMap();     //вывод карты в консоль




//        chooseCap();    //выбор фишки игроком



        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_PLAYER)) {
                System.out.println("Победил игрок!");
                break;
            } if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            } aiTurn();
            printMap();
            if (checkWin(DOT_AI)) {
                System.out.println("Победил AI");
                break;
            } if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }





    }

    public static void inintMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        return map[y][x] == DOT_EMPTY;
    }

    public static Scanner sc = new Scanner(System.in);
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_PLAYER;
    }

    public static Random rand = new Random();

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер сходил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_AI;
        }

    static boolean checkWin(char symb) {
        for (int i = 0; i < 3; i++) {
            if ((map[i][0] == symb && map[i][1] == symb && map[i][2] == symb) || (map[0][i] == symb && map[1][i] == symb && map[2][i] == symb)) { //по строкам и столбцам
                return true;
            }
            if ((map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) || (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb)) {  //по диагоналям
                return true;
            }
        } return false;
    }

    static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
//                                      Это только один из вариантов метода, пробовал и a.equals, и через
//                                      строки, и значениями, переделывал переменные в основных методах - результат
//                                      один и тот же: DOT_PLAYER и DOT_AI заполняются пустыми пробелами вместо символов
//                                      Пробовал объявлять код без метода тупо в main'e, все равно объявленные в начале
//                                      char'ы не заполняются всего лишь пустыми символами (пробелами).

//    public static void chooseCap()  {            //Выбор фишки
//
//        System.out.println("Выберите фишку, которой будете играть: введите Х или О");
//        Console cons = System.console();
//        if (cons != null) {
//            char a = (char) cons.reader().read();
//
//            if (Character.toString(a).matches("X")) {
//                char DOT_PLAYER = 'X';
//                char DOT_AI = 'O';
//                System.out.println("Вы выбрали Х, противник будет играть фишкой " + DOT_AI);
//
//            } else if (Character.toString(a).matches("O")) {
//                char DOT_PLAYER = 'O';
//                char DOT_AI = 'X';
//                System.out.println("Вы выбрали O, противник будет играть фишкой " + DOT_AI);
//
//            }
//        }
//    }


}
