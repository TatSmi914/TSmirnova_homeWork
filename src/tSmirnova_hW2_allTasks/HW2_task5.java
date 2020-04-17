package tSmirnova_hW2_allTasks;

import java.util.Random;

public class HW2_task5 {

    public static void main(String[] args) {

        Random random = new Random();
        int length = 10;
        int[] a = new int[length];
        for (int i = 0; i <= length - 1; i++) {
            a[i] = random.nextInt(50);
        }

        System.out.println("\nМассив случайных чисел : ");
        for (int num : a) {
            System.out.print(num + ", ");
        }
        int count = a.length - 1;

        while (count > 0) {
            for (int i = 0; i < count; i++) {

                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }

            }
            count--;
        }
        System.out.println("\nРезультаты сортировки : ");

        for (int num : a) {
            System.out.print(num + ", ");
        }

    }
}
