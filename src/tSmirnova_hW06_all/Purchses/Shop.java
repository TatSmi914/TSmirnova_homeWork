package tSmirnova_hW06_all.Purchses;

import java.util.PriorityQueue;

public class Shop {
    PriorityQueue<Visitor> visitors = new PriorityQueue<>();
    CashDesk cashDesks = new CashDesk();

    public void shopStatWork() {
        Visitor visitor1 = new Visitor("Александр", 1);
        visitor1.takeProducts(new String[]{"Хлеб", "Молоко", "Яблоки"});

        Visitor visitor2 = new Visitor("Иван", 1);
        visitor2.takeProducts(new String[]{"Бананы", "Мясо", "Зефир", "Курица", "Шоколад"});

        Visitor visitor3 = new Visitor("Слава", 2);
        visitor3.takeProducts(new String[]{"Йогурт", "Пряники", "Манго"});

        visitors.add(visitor1);
        visitors.add(visitor3);
        visitors.add(visitor2);
    }

    public void calculateVisitor() {
        Visitor visitor = visitors.poll();
        cashDesks.printReceipt(visitor);
        System.out.println();
    }

    public void shopWorkTime() {
        if (visitors.isEmpty()) {
            System.out.println("\nНет покупателей в очереди");
        } else {
            calculateVisitor();
            shopWorkTime();
        }
    }
}