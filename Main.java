import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        // Задание 1: Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        //Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        //Посчитать сколько раз встречается каждое слово.


        String[] inWords = new String[]{"Васильев", "Петров", "Сидоров", "Иванов", "Иванов"
                , "Попов", "Ветров", "Попов", "Агафьев", "Петров", "Морпехов", "Летов", "Князев", "Петров"
                , "Горшков", "Морпехов", "Горшков", "Сидоров", "Летов"};

        uniqueWords(inWords);

        System.out.println();

        // Задание 2:Написать простой класс ТелефонныйСправочник,
        // который хранит в себе список фамилий и телефонных номеров.
        // В этот телефонный справочник с помощью метода add() можно добавлять
        // записи. С помощью метода get() искать номер телефона по фамилии.
        // Следует учесть, что под одной фамилией может быть несколько
        // телефонов (в случае однофамильцев), тогда при запросе такой фамилии
        // должны выводиться все телефоны.

        Directory dir1 = new Directory();
        dir1.addPerson("Петров", "999-88-55");
        dir1.addPerson("Сидоров", "999-88-53");
        dir1.addPerson("Алексеев", "999-88-54");
        dir1.addPerson("Попов", "999-88-51");
        dir1.addPerson("Петров", "999-82-55");
        dir1.addPerson("Ростов", "999-44-55");

        Set<String> allDir = dir1.getAllSurnames();
        for (String surname : allDir) {
            Set<String> phones = dir1.get(surname);
            System.out.printf("%s: %s%n", surname, phones);
        }

    }

    public static void uniqueWords(String[] arr) {          //Метод для нахождения уникальных значений

        System.out.println("Всего слов: " + arr.length);

        Set<String> nSet = new HashSet<>();
        for (String x : arr) {
            nSet.add(x);
        } System.out.println("Уникальных слов: " + nSet.size());
        System.out.println();

        Map<String, Integer> occurrences = new HashMap<String, Integer>();      // Подсчет количества повторений

        for (String word : arr) {
            Integer oldCount = occurrences.get(word);
            if (oldCount == null) {
                oldCount = 0;
            }
            occurrences.put(word, oldCount + 1);
        } for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
