package tSmirnova_hW3_allTasks.Student;

import java.util.ArrayList;

//HW2 TASK1 - Создайте класс Student, описывающий студента университета.
public class Student {

    private String name;
    private String surname;
    private String dateOfBirthday;
    private int course;

    //Конструктор
    public Student(String name, String surname, String dateOfBirthday, int course) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
        this.course = course;
    }

    //Getters and Setters для каждого поля.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(ArrayList<Student> students, int course) {
        for (Student person : students) {
            if (person.getCourse() == course)
                System.out.println("Students' list : " + person.getName() + " " + person.getSurname() + " " + "course :" + course);
        }
    }
}