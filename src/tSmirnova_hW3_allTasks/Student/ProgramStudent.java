package tSmirnova_hW3_allTasks.Student;

import java.util.ArrayList;

public class ProgramStudent {

    public static void main(String[] args) {

        //HW2 TASK1 - Протестируйте работу класса Student.

        //Student list
        Student stud1 = new Student("Sergej", "Smirnov", "11.01.2003", 1);
        Student stud2 = new Student("Daniil", "Mirnuj", "12.02.2002", 2);
        Student stud3 = new Student("Nikita", "Sergeev", "13.03.2001", 3);
        Student stud4 = new Student("Anastasija", "Kislova", "14.04.2000", 4);
        Student stud5 = new Student("Elena", "Lenina", "15.05.1999", 5);
        Student stud6 = new Student("Artem", "Bobrov", "16.06.2003", 1);
        Student stud7 = new Student("Olga", "Andreeva", "17.07.2002", 2);
        Student stud8 = new Student("Natali", "Lapshina", "18.08.2001", 3);

        //List of students
        ArrayList<Student> stud = new ArrayList<>();
        stud.add(stud1);
        stud.add(stud2);
        stud.add(stud3);
        stud.add(stud4);
        stud.add(stud5);
        stud.add(stud6);
        stud.add(stud7);
        stud.add(stud8);

        //Method printStudents in use
        System.out.println("Test started. List of students is the following: ");
        Student.printStudents(stud, 1);
        System.out.println("\nTest started. List of students is the following: ");
        Student.printStudents(stud, 3);
        System.out.println("\nTest started. List of students is the following: ");
        Student.printStudents(stud, 2);

        //getName verification
        System.out.println("\nTest started.");
        Student stud9 = new Student("Vera", "Zorka", "19.09.2001", 4);
//        if (stud9.getName().equals("Vera")){
//            printResult (true)
//            }
        printResult(stud9.getName().equals("Vera"));
        printResult(!stud9.getName().equals("Oleg"));
        //setName verification
        stud9.setName("Oleg");
        printResult(!stud9.getName().equals("Vera"));
        printResult(stud9.getName().equals("Oleg"));

        //getName verification
        System.out.println("\nTest started. \nFirst student: " + stud1.getName() + " " + stud1.getSurname() + " " + stud1.getDateOfBirthday() + " " + stud1.getCourse() + " ");
        System.out.println("\nTest started. \nSecond student: " + stud2.getName() + " " + stud2.getSurname() + " " + stud2.getDateOfBirthday() + " " + stud2.getCourse() + " ");

        //Setter verification
        System.out.println("\nTest started. Show student: " + stud9.getName() + " " + stud9.getSurname() + " " + stud9.getDateOfBirthday() + " " + "course : " + stud9.getCourse());
        stud9.setName("Polina");
        stud9.setSurname("Zajac");
        stud9.setDateOfBirthday("20.10.2002");
        stud9.setCourse(3);
        System.out.println("\nTest finished. Show student: " + stud9.getName() + " " + stud9.getSurname() + " " + stud9.getDateOfBirthday() + " " + "course : " + stud9.getCourse());
    }

    private static void printResult(boolean result) {
        if (result) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }
    }
}