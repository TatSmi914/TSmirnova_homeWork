package tSmirnova_hW06_all.Botanist;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BotanistMain {
    public static void main(String[] args) {
        System.out.println("Обучающая программа запущена!");
        executeProgram();
    }

    public static void executeProgram() {
        Botanist plant = new Botanist();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nСделайте свой выбор : " +
                "\n1.Вывести на печать все растения " +
                "\n2.Вывести плод растения" +
                "\n3.Выйти из обучающей программы");
        if (scanner.hasNext()) {
            switch (scanner.nextInt()) {
                case 1:
                    plant.allFruitTypes();
                    executeProgram();
                    break;
                case 2:
                    plant.concreteFruitType();
                    executeProgram();
                    break;
                case 3:
                    System.out.println("Спасибо за внимание!");
            }
        }
    }
}