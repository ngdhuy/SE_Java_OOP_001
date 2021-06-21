package vn.edu.hcmus.fit.ndhuy.teacher;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.ndhuy.teacher
 * Created by ndhuy
 * Date 21/06/2021 - 16:58
 * Description: Teadcher management
 */

public class FacultyTeacher extends Teacher {
    static final int TEACHING_HOUR_DEFAULT = 40;
    static final int EXTRA_SALARY_HOUR_DEFAULT = 200;

    private int salary;
    private int minimum_teaching_hours;

    private int extra_salary_hour;

    public FacultyTeacher() {
        super();

        this.salary = 0;
        this.minimum_teaching_hours = TEACHING_HOUR_DEFAULT;
        this.extra_salary_hour = EXTRA_SALARY_HOUR_DEFAULT;
    }

    public FacultyTeacher(String name, String email, String address, String telephone, int teaching_hours, int salary, int minimum_teaching_hours, int extra_salary_hour) {
        super(name, email, address, telephone, teaching_hours);

        this.salary = salary;

        if (minimum_teaching_hours > 0)
            this.minimum_teaching_hours = minimum_teaching_hours;
        else
            this.minimum_teaching_hours = TEACHING_HOUR_DEFAULT;

        if (extra_salary_hour > 0)
            this.extra_salary_hour = extra_salary_hour;
        else
            this.extra_salary_hour = EXTRA_SALARY_HOUR_DEFAULT;
    }

    public FacultyTeacher(FacultyTeacher facultyTeacher) {
        super(facultyTeacher.getName(), facultyTeacher.getEmail(), facultyTeacher.getAddress(), facultyTeacher.getTelephone(), facultyTeacher.getTeachingHours());
        this.salary = facultyTeacher.salary;
        this.minimum_teaching_hours = facultyTeacher.minimum_teaching_hours;
        this.extra_salary_hour = facultyTeacher.extra_salary_hour;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 0)
            this.salary = salary;
    }

    public int getMinimumTeachingHours() {
        return minimum_teaching_hours;
    }

    public void setMinimumTeachingHours(int minimum_teaching_hours) {
        if (minimum_teaching_hours > 0)
            this.minimum_teaching_hours = minimum_teaching_hours;
    }

    public int getExtraSalaryHour() {
        return extra_salary_hour;
    }

    public void setExtraSalaryHour(int extra_salary_hour) {
        if (extra_salary_hour > 0)
            this.extra_salary_hour = extra_salary_hour;
    }

    @Override
    public void input() {
        System.out.println("--- Enter Faculty Teacher information ---");

        super.input();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Salary: ");
        this.salary = scanner.nextInt();

        System.out.print("Minimum teaching hour: ");
        this.setSalary(scanner.nextInt());

        System.out.print("Extra salary hour: ");
        this.setExtraSalaryHour(scanner.nextInt());
    }

    @Override
    public void output() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "FacultyTeacher{" +
                super.toString() +
                "salary=" + salary +
                ", minimum_teaching_hours=" + minimum_teaching_hours +
                ", extra_salary_hour=" + extra_salary_hour +
                '}';
    }

    @Override
    public int calculateSalary() {
        return this.salary + ((this.getTeachingHours() - this.minimum_teaching_hours) * extra_salary_hour);
    }
}
