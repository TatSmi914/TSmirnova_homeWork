package tSmirnova_hW2_allTasks;

import java.util.Scanner;
import java.util.Random;

public class HW2_task6 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Show array size: ");
        System.out.println("Insert row size: ");
        int row = in.nextInt();
        System.out.print("row size = " + row);
        System.out.println("\nInsert column size: ");
        int column = in.nextInt();
        System.out.print("column size = " + column);
        System.out.println();
        int dimArray[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                dimArray[i][j] = random.nextInt(10);
                System.out.print(" " + dimArray[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (dimArray[i][j] % 2 == 0) {
                    dimArray[i][j] = 0;
                } else dimArray[i][j] = 1;

            }
        }
        System.out.println("Show new array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(" " + dimArray[i][j] + " ");
            }
            System.out.println();

        }
    }
}
