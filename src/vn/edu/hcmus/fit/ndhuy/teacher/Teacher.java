package vn.edu.hcmus.fit.ndhuy.teacher;

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.ndhuy.teacher
 * Created by ndhuy
 * Date 21/06/2021 - 15:52
 * Description: Teacher management
 */

public abstract class Teacher {
    private String name;
    private String email;
    private String address;
    private String telephone;
    private int teaching_hours;

    public Teacher() {
        this.name = "";
        this.email = "";
        this.address = "";
        this.telephone = "";
        this.teaching_hours = 0;
    }

    public Teacher(String name, String email, String address, String telephone, int teaching_hours) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.telephone = telephone;
        this.teaching_hours = teaching_hours;
    }

    public Teacher(Teacher teacher) {
        this.name = teacher.name;
        this.email = teacher.email;
        this.address = teacher.address;
        this.telephone = teacher.telephone;
        this.teaching_hours = teacher.teaching_hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getTeachingHours() {
        return teaching_hours;
    }

    public void setTeachingHours(int teaching_hours) {
        if (teaching_hours > 0)
            this.teaching_hours = teaching_hours;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        this.name = scanner.nextLine();

        System.out.print("Email: ");
        this.email = scanner.nextLine();

        System.out.print("Address: ");
        this.address = scanner.nextLine();

        System.out.print("Telephone: ");
        this.telephone = scanner.nextLine();

        System.out.print("Teaching hours: ");
        this.setTeachingHours(scanner.nextInt());
    }

    public void output() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
               ", email='" + email + '\'' +
               ", address='" + address + '\'' +
               ", telephone='" + telephone + '\'' +
               ", teaching_hours=" + teaching_hours;
    }

    public abstract int calculateSalary();
}
