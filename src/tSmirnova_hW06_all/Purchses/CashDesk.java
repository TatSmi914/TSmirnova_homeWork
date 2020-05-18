package tSmirnova_hW06_all.Purchses;

import java.util.*;

public class CashDesk {

    private Map<String, Double> productPrises;

    {
        productPrises = new HashMap<>();
        productPrises.put("Хлеб", 1.55);
        productPrises.put("Молоко", 1.34);
        productPrises.put("Яблоки", 5.9);
        productPrises.put("Бананы", 4.9);
        productPrises.put("Мясо", 12.8);
        productPrises.put("Зефир", 4.5);
        productPrises.put("Курица", 7.4);
        productPrises.put("Шоколад", 5.1);
        productPrises.put("Йогурт", 2.21);
        productPrises.put("Пряники", 1.85);
        productPrises.put("Манго", 5.34);
        productPrises.put("Авокадо", 15.9);
        productPrises.put("Перец", 14.9);
        productPrises.put("Кефир", 12.8);
        productPrises.put("Сметана", 4.5);
        productPrises.put("Сосиски", 27.4);
        productPrises.put("Сок", 9.1);
    }

//    public double calculate(List<String> products) {
//        double sum = 0;
//        for (String product : products) {
//            sum = sum + productPrises.get(product);
//        }
//        return sum;
//    }

    public void printReceipt(Visitor visitor){
        double sum = 0;
        for (String product : visitor.getProducts()) {
            sum = sum + productPrises.get(product);
            System.out.println(product + " : " + productPrises.get(product));
        }
        System.out.println("-----------------------------------------------------");
        System.out.printf("Покупатель %s приобрёл продуктов на Общую сумму: %.2f \n", visitor.getName(), sum);

        //System.out.println("Покупатель " +  visitor.getName() + "приобрёл продуктов на Общую сумму: " + sum);
    }
}