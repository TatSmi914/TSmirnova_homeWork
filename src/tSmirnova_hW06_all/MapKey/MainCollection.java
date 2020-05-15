package tSmirnova_hW06_all.MapKey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainCollection {
    public static void main(String[] args) {
        Map<Integer, String> collectionData = new HashMap<>();

        collectionData.put(1, "Иван");
        collectionData.put(2, "Владимир");
        collectionData.put(3, "Сергей");
        collectionData.put(4, "Даниил");
        collectionData.put(5, "Никита");
        collectionData.put(6, "Ольга");
        collectionData.put(7, "Елена");
        collectionData.put(8, "Наталья");
        collectionData.put(9, "Илья");
        collectionData.put(10, "Егор");
        collectionData.put(11, "Дмитрий");
        collectionData.put(12, "Юлия");
        collectionData.put(13, "Екатерина");

        List<Integer> keys = new ArrayList(collectionData.keySet());
        if (!keys.isEmpty()) {
            System.out.println("Массив Ключей " + keys);
        }

       List<String> values = new ArrayList(collectionData.values());
        if (!values.isEmpty()) {
            System.out.println("Массив Значений " + values);
        }
    }
}