package tSmirnova_hW2_allTasks;

import java.util.Scanner;

public class HW2_task1_3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //TASK 1
        // Имеется прямоугольное отверстие размерами a и b. Определите можно ли его полностью закрыть круглой картонкой радиусом r.
        // Вывести результат на экран. Данные a, b и r ввести с консоли.
        System.out.println("TASK 1 \nВопрос: \"Можно прямоугольное отверстие полностью закрыть круглой картонкой радиусом r ?\"");
        System.out.print("Введите радиус r: ");
        int r = in.nextInt();
        System.out.print("Введите сторону квадрата a: ");
        int a = in.nextInt();
        System.out.print("Введите сторону квадрата b: ");
        int b = in.nextInt();

        if (2 * r >= Math.sqrt(a * a + b * b))
            System.out.println("Ответ: Можно");
        else
            System.out.println("Ответ: Нельзя");

        //TASK 2
        // Имеется целое число n < 10. Вывести какому дню недели оно соответствует,
        //если при n = 1 день недели = Понедельник.
        System.out.println("\nTASK 2");
        System.out.print("Введите число : ");
        int n = in.nextInt();
        switch (n) {
            case 1:
                System.out.println("День недели: Понедельник");
                break;
            case 2:
                System.out.println("День недели: Вторник");
                break;
            case 3:
                System.out.println("День недели: Среда");
                break;
            case 4:
                System.out.println("День недели: Четверг");
                break;
            case 5:
                System.out.println("День недели: Пятница");
                break;
            case 6:
                System.out.println("День недели: Суббота");
                break;
            case 7:
                System.out.println("День недели: Воскресенье");
                break;
            default:
                System.out.println("День недели не соответствует заданному числу");

                //TASK 3
                //Написать программу, которая бы вывела в консоль звездочки следующим образом:
                //*****
                //*****
                //*****
                //*****
                System.out.println("\nTASK 3");
                for (int times = 0; times < 4; times++) {
                    for (int line = 0; line < 5; line++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

        }
    }
}
