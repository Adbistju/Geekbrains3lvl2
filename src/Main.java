import java.util.*;

public class Main {

    public static void main(String[] args) {
        wordSet();
        System.out.println();
        book();

    }
    static void wordSet() {
        System.out.println("Задание 1");
        Map<String, Integer> wordHashMap = new HashMap<>();
        String[] words = {
                "AUDI","VOLVO","FORD","HYUNDAI","MAZDA","MINI","NISAN",
                "AUDI","VOLVO","FORD",
                "OPEL","PONTIAC","INFINITI","HUMMER","HONDA","LAMBORGHINI","PEUGEOT",
                                 "INFINITI","HUMMER","HONDA"
        };

        for (int i = 0; i < words.length; i++) {
            if (wordHashMap.containsKey(words[i]))
                wordHashMap.put(words[i], wordHashMap.get(words[i]) + 1);
            else
                wordHashMap.put(words[i], 1);
        }
        System.out.println(wordHashMap);
    }
    private static void book() {
        System.out.println("Задание 2");
        BookNumber directory = new BookNumber();

        directory.add("altufev", "8977606281");
        directory.add("altufev", "8912155326");
        directory.add("papaev", "8917155552");
        directory.add("papaev", "8913455672");
        directory.add("altufev", "899999999");
        directory.add("igoryan", "899111111");
        directory.add("papaev", "89923231999");
        directory.add("smetanov", "8888123113");
        directory.add("igoryan", "8324325234");

        System.out.println(directory.get("altufev"));
        System.out.println(directory.get("papaev"));
        System.out.println(directory.get("igoryan"));
        System.out.println(directory.get("smetanov"));
    }
}
