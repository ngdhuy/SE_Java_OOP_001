package vn.edu.hcmus.fit.ndhuy.se_06_java_oop;

import vn.edu.hcmus.fit.ndhuy.teacher.*;

public class Main {

    public static void main(String[] args) {
        ListOfTeachers listOfTeachers = new ListOfTeachers();
        for(int i = 0; i < 3; i++)
            listOfTeachers.addNew();

        listOfTeachers.print();
    }
}
