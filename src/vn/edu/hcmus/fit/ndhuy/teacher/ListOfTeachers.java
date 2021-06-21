package vn.edu.hcmus.fit.ndhuy.teacher;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.ndhuy.teacher
 * Created by ndhuy
 * Date 21/06/2021 - 18:04
 * Description: ...
 */

public class ListOfTeachers {
    private ArrayList<Teacher> list_of_teacher;

    public ListOfTeachers() {
        this.list_of_teacher = new ArrayList<Teacher>();
    }

    public ListOfTeachers(ArrayList<Teacher> list_of_teacher) {
        this.list_of_teacher = list_of_teacher;
    }

    public ListOfTeachers(ListOfTeachers teachers) {
        this.list_of_teacher = teachers.list_of_teacher;
    }

    public ArrayList<Teacher> getList_of_teacher() {
        return list_of_teacher;
    }

    public void setList_of_teacher(ArrayList<Teacher> list_of_teacher) {
        this.list_of_teacher = list_of_teacher;
    }

    public int showMenuChooseTeacher() {
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        do {
            System.out.println("Choose type of Teacher:");
            System.out.println("\t1. Faculty teacher");
            System.out.println("\t2. Visiting teacher");
            System.out.print("Chooe: ");
            choose = scanner.nextInt();
            if (choose != 1 && choose != 2)
                System.out.println("Your choose is invalid. Please choose (1) or (2)!");
        } while (choose != 1 && choose != 2);
        return choose;
    }

    public void addNew() {
        System.out.println("--- Add new Teacher ---");
        if (showMenuChooseTeacher() == 1) {
            FacultyTeacher teacher = new FacultyTeacher();
            teacher.input();
            this.list_of_teacher.add(teacher);
        } else {
            VisitingTeacher teacher = new VisitingTeacher();
            teacher.input();
            this.list_of_teacher.add(teacher);
        }
    }

    public void print() {
        for (Teacher teacher : this.list_of_teacher)
            teacher.output();
    }

    public void printFacultyTeachers() {
        for (Teacher teacher : this.list_of_teacher)
            if (teacher instanceof FacultyTeacher)
                teacher.output();
    }

    public void printVisitingTeacher() {
        for (Teacher teacher : this.list_of_teacher)
            if (teacher instanceof VisitingTeacher)
                teacher.output();
    }

    public void inputFromFile(String fileName) {

    }

    public int totalSalary() {
        int total = 0;
        for (Teacher teacher : this.list_of_teacher)
            total += teacher.calculateSalary();
        return total;
    }
}
