package ru.geekbrains.erik;

public class ex1_5 {
    public static void main(String[] args) {

        positiveNegative(-3);

    } static void positiveNegative (int i) {
        if (i < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }
}
