package vn.edu.hcmus.fit.ndhuy.teacher;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.ndhuy.teacher
 * Created by ndhuy
 * Date 21/06/2021 - 17:38
 * Description: Teacher management
 */

public class VisitingTeacher extends Teacher {
    static final int SALARY_HOUR_DEFAULT = 200;

    private String company_name;
    private int salary_hour;

    public VisitingTeacher() {
        super();
        this.company_name = "";
        this.salary_hour = SALARY_HOUR_DEFAULT;
    }

    public VisitingTeacher(String name, String email, String address, String telephone, int teaching_hours, String company_name, int salary_hour) {
        super(name, email, address, telephone, teaching_hours);
        this.company_name = company_name;
        if (salary_hour > 0)
            this.salary_hour = salary_hour;
        else
            this.salary_hour = SALARY_HOUR_DEFAULT;
    }

    public String getCompanyName() {
        return company_name;
    }

    public void setCompanyName(String company_name) {
        this.company_name = company_name;
    }

    public int getSalaryHour() {
        return salary_hour;
    }

    public void setSalaryHour(int salary_hour) {
        if (salary_hour > 0)
            this.salary_hour = salary_hour;
    }

    @Override
    public void input() {
        System.out.println("--- Enter Visiting Teacher information ---");

        super.input();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Company name: ");
        this.company_name = scanner.nextLine();

        System.out.print("Salary hour: ");
        this.setSalaryHour(scanner.nextInt());
    }

    @Override
    public void output() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "VisitingTeacher{" +
                super.toString() +
                "company_name='" + company_name + '\'' +
                ", salary_hour=" + salary_hour +
                '}';
    }

    @Override
    public int calculateSalary() {
        return this.getTeachingHours() * this.salary_hour;
    }
}
