package vn.edu.hcmus.fit.ndhuy.se_06_java_oop;

import vn.edu.hcmus.fit.ndhuy.number.Fraction;

public class Main {

    public static void main(String[] args) {
        Fraction frac_1 = new Fraction();
        Fraction frac_2 = new Fraction(4, 8);
        System.out.println(frac_1);
        System.out.println(frac_2);
        Fraction frac_3 = frac_1.Sum(frac_2);
        System.out.println(frac_3);
        if (frac_1.Equal(frac_2))
            System.out.println(frac_1 + " is equal " + frac_2);
        else if(frac_1.Less(frac_2))
            System.out.println(frac_1 + " is less than " + frac_2);
        else
            System.out.println(frac_1 + " is greater than " + frac_2);
    }
}
