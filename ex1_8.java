package ru.geekbrains.erik;

public class ex1_8 {
    public static void main(String[] args) {

        leapOrNot(2020);

    } static void leapOrNot (int i) {
      if (i % 4 == 0 && i != 100) {
          System.out.println("Год високосный");
      } else if (i % 400 == 0) {
          System.out.println("Год високосный");
      } else {
          System.out.println("Год не високосный");
      }
    }
}
