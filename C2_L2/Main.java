package C2_L2;

public class Main {

    public static void main(String[] args) {

        String[][] arr1 = new String[6][5];

        String[][] arr2 = new String[4][4]; //{{"1","2","3","4"},{"One","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        arr2[0][0] = "1";
        arr2[1][0] = "2";
        arr2[2][0] = "3";
        arr2[3][0] = "4";
        arr2[0][1] = "One";
        arr2[1][1] = "2";
        arr2[2][1] = "3";
        arr2[3][1] = "4";
        arr2[0][2] = "1";
        arr2[1][2] = "2";
        arr2[2][2] = "3";
        arr2[3][2] = "4";
        arr2[0][3] = "1";
        arr2[1][3] = "2";
        arr2[2][3] = "3";
        arr2[3][3] = "4";


    //Задание 3: Вызвать методы в Main:


        // Задание 1:
         myArr(arr1);

         //Задание 2:
        tryStrToInt(arr2);




    }

    // Задание 2: Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
    //сли в каком-то элементе массива преобразование не удалось
    //(например, в ячейке лежит символ или текст вместо числа), должно быть брошено
    //исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.

    public static void tryStrToInt(String[][] arr) {

        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] instanceof String) {
                        int a = Integer.parseInt(arr[i][j]);
                        System.out.print(a + " ");
                    } else{
                        throw new MyArrayDataException();
                    }
                }
                System.out.println();
            }
        } catch (MyArrayDataException t) {
            t.printStackTrace();
        }
    }

//    public static void strToInt(String[][] arr)  {                 // Метод преобразовывает массив строк в массив чисел
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                int a = Integer.parseInt(arr[i][j]);
//                System.out.print(a + " ");
//            }
//            System.out.println();
//        }
//    }

//        public static void newArray(int a, int b) {                 // Метод просто создает строковый массив
//            String[][] arrStr = new String[a][b];
//            for (int i = 0; i < arrStr.length; i++) {
//                for (int j = 0; j < arrStr[i].length; j++) {
//                    arrStr[i][j] = "Word " + j;
//                    System.out.print(arrStr[i][j] + " ");
//                }
//                System.out.println("");
//            }
//        }



        // Задание 1: Напишите метод, на вход которого подаётся
        // двумерный строковый массив размером 4х4,
        // при подаче массива другого размера необходимо бросить
        // исключение C2_L2.MyArraySizeException.

    public static void myArr(String[][] arr) {

        try {
            if (arr.length != 4) {
                throw new MyArraySizeException();
            }
        } catch (MyArraySizeException e) {
           e.printStackTrace();

        }
    }
}
