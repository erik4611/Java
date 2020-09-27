package ru.geekbrains.erik;

public class ex1_3 {
    public static void main(String[] args) {
    int e = resultExpression();
        System.out.println(e);
    }
    static int resultExpression () {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int i = a * (b + (c / d));
        return i;
    }

}
