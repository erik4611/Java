public class Main {

    public static void main(String[] args) {

        //Задание 1

        Cat cat1 = new Cat("Fedor", 10, 50);
        Human human1 = new Human("Alex", 5, 25);
        Robot robot1 = new Robot("t800", 2950, 2);

        //Задание 2:

        Treadmill tread1 = new Treadmill(150);
        Wall wall1 = new Wall(7);

        //Созданные объекты прыгают через созданную стену:

        cat1.Jumping(wall1.getWallHeight());
        human1.Jumping(wall1.getWallHeight());
        robot1.Jumping(wall1.getWallHeight());

        //Созданные объекты бегут по дорожке:

        cat1.Running(tread1.getTreadLength());
        human1.Running(tread1.getTreadLength());
        robot1.Running(tread1.getTreadLength());

        //Задание 3:

        Cat cat2 = new Cat("Cat2", 10, 15);
        Cat cat3 = new Cat("Cat3", 15, 20);
        Human human2 = new Human("Rob", 5, 7);
        Human human3 = new Human("Bob", 10, 12);
        Robot robot2 = new Robot("t1000", 200, 200);
        Robot robot3 = new Robot("t1100", 500, 500);

        Wall wall2 = new Wall(300);
        Wall wall3 = new Wall(5);
        Treadmill treadmill2 = new Treadmill(20);
        Treadmill treadmill3 = new Treadmill(5);



        Object[] arr1 = {cat1, cat2, cat3, human1, human2, human3, robot1, robot2, robot3};
        Object[] arr2 = {wall1, wall2, wall3, tread1, treadmill2, treadmill3};




    }
    public void test1(Object[] a, Object[] b) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                

            }
        }

    }



}
