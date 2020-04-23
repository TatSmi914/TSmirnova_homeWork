package tSmirnova_hW2_allTasks;

import java.util.Random;

public class HW2_task7 {

    public static void main(String[] args) {
        //Зубчатый массив
        Random rnd = new Random();
        int row = rnd.nextInt(5) + 1;
        int myArray[][] = new int[row][];
        for (int i = 0; i < row; i++) {
            myArray[i] = new int[rnd.nextInt(20) +1];
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = rnd.nextInt(10) + 1;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}


        //Обычный массив
//        //Random rnd = new Random(System.nanoTime());
//        Random rnd = new Random();
//        int row = rnd.nextInt(5) + 1;
//        int column = rnd.nextInt(6) + 1;
//        System.out.println("row number = " + row);
//        System.out.println("column number = " + column);
//        int myArray[][] = new int[row][column];
//        for (int i = 0; i < row; i++) {
//            // myArray[i] = new int [rnd.nextInt(20)];
//            for (int j = 0; j < column; j++) {
//                myArray[i][j] = rnd.nextInt(10);
//            }
//        }