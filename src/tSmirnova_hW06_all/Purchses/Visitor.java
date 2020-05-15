package tSmirnova_hW06_all.Purchses;

import java.util.ArrayList;
import java.util.List;

public class Visitor implements Comparable<Visitor> {

    List<String> products = new ArrayList<>();
    String name;
    int priority;

    public Visitor(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public void takeProducts(String[] products) {
        for (String product : products) {
            this.products.add(product);
        }
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Visitor visitor) {
        if (this.priority > visitor.priority) {
            return 1;
        } else if (this.priority < visitor.priority) {
            return -1;
        } else {
            return 0;
        }
    }
}