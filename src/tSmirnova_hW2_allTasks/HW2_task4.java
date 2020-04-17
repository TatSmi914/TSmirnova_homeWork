package tSmirnova_hW2_allTasks;

import java.util.Random;

public class HW2_task4 {

    public static void main(String[] args) {

        Random random = new Random();
        int numbers = 10;
        double[] vector = new double[numbers];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextDouble() * 100 - 50;
        }

        System.out.println("\nМассив случайных чисел : ");
        for (double num : vector) {
            System.out.print(num + " ");
        }

        int maxIndex = 0, minIndex = 0;
        double max, min;
        max = vector[0];
        min = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
                maxIndex = i;
            }
            if (vector[i] < min) {
                min = vector[i];
                minIndex = i;
            }
        }

        double sum = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 0) {
                sum = sum + vector[i];
            }
        }

        System.out.println("\nСумма отрицательных элементов : ");
        // for (int num1 : sum) {
        System.out.print(sum + " ");


        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
                maxIndex = i;
            }
            if (vector[i] < min) {
                min = vector[i];
                minIndex = i;
            }
        }

        double multipl = 1;
        int temp = 0;
        if (maxIndex < minIndex) {
            temp = maxIndex;
            maxIndex = minIndex;
            minIndex = temp;
        }
        for (int i = minIndex + 1; i < maxIndex; i++) {
            multipl *= vector[i];
        }

        System.out.println("\nПроизведение : ");
        System.out.print(multipl + ", ");

    }
}
