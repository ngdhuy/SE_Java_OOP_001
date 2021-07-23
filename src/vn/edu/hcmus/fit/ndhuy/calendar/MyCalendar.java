package vn.edu.hcmus.fit.ndhuy.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.ndhuy.calendar
 * Created by ndhuy
 * Date 23/07/2021 - 12:42
 * Description: ...
 */
public class MyCalendar {
    private int month;
    private int year;

    public MyCalendar() {
        this.month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        this.year = Calendar.getInstance().get(Calendar.YEAR);
    }

    public MyCalendar(int month, int year) {
        if (1 <= month && month <= 12)
            this.month = month;
        else
            this.month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        if (0 < year)
            this.year = year;
        else
            this.year = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (1 <= month && month <= 12)
            this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(0 < year)
            this.year = year;
    }

    public boolean input() {
        Scanner scan = new Scanner(System.in);
        int month, year;

        System.out.print("Enter full year (e.g., 2021): ");
        year = scan.nextInt();
        if(0 < year)
            this.year = year;
        else {
            System.out.println("Year is invalid");
            return false;
        }

        System.out.print("Enter month as a number between 1 and 12: ");
        month = scan.nextInt();
        if(1 <= month && month <= 12)
            this.month = month;
        else {
            System.out.println("Month is invalid");
            return false;
        }

        return true;
    }

    public boolean isLeapYear() {
        return ((this.year % 4 == 0) && (this.year % 100 == 0)) || (this.year % 400 == 0);
    }

    public int getDayOfMonth(){
        int day = 0;
        switch (this.month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                if(isLeapYear())
                    day = 29;
                else
                    day = 28;
        }
        return day;
    }

    public int getStartDayInWeek() {
        String str_date = "01/"+this.toString();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = formatDate.parse(str_date);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            return cal.get(Calendar.DAY_OF_WEEK);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return -1;
    }

    public String getNameOfMonth(){
        String nameOfMonth = "";
        switch (this.month){
            case 1:
                nameOfMonth = "January";
                break;
            case 2:
                nameOfMonth = "February";
                break;
            case 3:
                nameOfMonth = "March";
                break;
            case 4:
                nameOfMonth = "April";
                break;
            case 5:
                nameOfMonth = "May";
                break;
            case 6:
                nameOfMonth = "June";
                break;
            case 7:
                nameOfMonth = "July";
                break;
            case 8:
                nameOfMonth = "August";
                break;
            case 9:
                nameOfMonth = "September";
                break;
            case 10:
                nameOfMonth = "October";
                break;
            case 11:
                nameOfMonth = "November";
                break;
            case 12:
                nameOfMonth = "December";
                break;
        }
        return nameOfMonth;
    }

    public void printCalendar() {
        System.out.println("\t\t\t\t\t" + this.getNameOfMonth() + ", " + this.year);
        System.out.println("----------------------------------------------------");
        System.out.println("Sun\t\tMon\t\tTue\t\tWeb\t\tThu\t\tFri\t\tSat");
        int startDay = this.getStartDayInWeek();
        int dayOfMonth = this.getDayOfMonth();
        for(int i = 1; i < startDay; i++)
            System.out.print("\t\t");
        for(int i = 1; i <= dayOfMonth; i++){
            System.out.print(i + "\t\t");
            startDay++;
            if(startDay > 7) {
                System.out.println();
                startDay = 1;
            }
        }
    }

    public String toString() {
        return ((Integer)this.month).toString() + "/" + ((Integer)this.year).toString();
    }
}
