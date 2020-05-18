package tSmirnova_hW06_all.Botanist;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Botanist {

    private Map<String, String> fruits;

    {
        fruits = new HashMap<>();
        fruits.put("Арбуз", "Ягода");
        fruits.put("Дыня", "Овощ");
        fruits.put("Яблоко", "Фрукт");
        fruits.put("Банан", "Трава");
        fruits.put("Вишня", "Ягода");
        fruits.put("Груша", "Фрукт");
        fruits.put("Малина", "Ягода");
        fruits.put("Персик", "Фрукт");

    }

    public void allFruitTypes() {
        for (Map.Entry<String, String> type : fruits.entrySet()) {
            System.out.println(type.getKey() + " - " + type.getValue());
        }
    }

    public void concreteFruitType() {
        System.out.print("ВВедите растение : ");
        Scanner scanner = new Scanner(System.in);
        String concreteFruit = scanner.nextLine();
        String result = fruits.get(concreteFruit);

        if (result == null) {
            System.out.println("Нет такого растения в списке");
        } else {
            System.out.println("Для растения " + concreteFruit + " плодом является -  " + result);
        }
    }
}