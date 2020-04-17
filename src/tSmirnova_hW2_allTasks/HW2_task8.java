package tSmirnova_hW2_allTasks;

import java.util.Random;

public class HW2_task8 {

    static int n;

    public static void main(String[] args) {

        Random random = new Random();
        n = random.nextInt(10 + 1);
        int i = 2;
        System.out.print(n);
        System.out.println();

        if (n <= 3) {
            System.out.printf("Is number %d simple - YES", n);
        } else {
            recurse(2);
        }
    }

    private static int recurse(int i) {
        if (n == i) {
            System.out.printf("Is number %d simple - YES", n);
            return n;
        } else if (n % i == 0) {
            System.out.printf("Is number %d simple - NO", n);
            return n;
        } else {
            return recurse(++i);
        }
    }
}
