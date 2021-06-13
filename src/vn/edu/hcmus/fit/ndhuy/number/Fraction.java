package vn.edu.hcmus.fit.ndhuy.number;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 * vn.edu.hcmus.fit.ndhuy.fraction
 *
 * Created by ndhuy
 * Date 13/06/2021 - 10:48
 * Description: Define Fraction Class
 */

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(Fraction fraction) {
        if (fraction.denominator != 0) {
            this.numerator = fraction.numerator;
            this.denominator = fraction.denominator;
        } else {
            this.numerator = 0;
            this.denominator = 1;
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0)
            this.denominator = denominator;
    }

    public Fraction Sum(Fraction fraction) {
        Fraction result = new Fraction();
        result.numerator = (this.numerator * fraction.denominator) + (this.denominator * fraction.numerator);
        result.numerator = this.denominator * fraction.denominator;
        return Optimize(result);
    }

    public Fraction Sub(Fraction fraction) {
        Fraction result = new Fraction();
        result.numerator = (this.numerator * fraction.denominator) - (this.denominator * fraction.numerator);
        result.numerator = this.denominator * fraction.denominator;
        return Optimize(result);
    }

    public Fraction Mul(Fraction fraction) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * fraction.numerator;
        result.numerator = this.denominator * fraction.denominator;
        return Optimize(result);
    }

    public Fraction Div(Fraction fraction) {
        if (fraction.numerator != 0) {
            Fraction result = new Fraction();
            result.numerator = this.numerator * fraction.denominator;
            result.numerator = this.denominator * fraction.numerator;
            return Optimize(result);
        } else {
            return null;
        }
    }

    public Fraction Optimize(Fraction fraction) {
        int largestCommonDivision = MyMath.FindLargestCommonDivision(fraction.numerator, fraction.denominator);
        fraction.numerator = fraction.numerator / largestCommonDivision;
        fraction.denominator = fraction.denominator / largestCommonDivision;
        return fraction;
    }

    public boolean Equal(Fraction fraction) {
        return (this.numerator * fraction.denominator) == (this.denominator * fraction.numerator);
    }

    public boolean Less(Fraction fraction) {
        return (this.numerator * fraction.denominator) < (this.denominator * fraction.numerator);
    }

    public boolean Greater(Fraction fraction) {
        return (this.numerator * fraction.denominator) > (this.denominator * fraction.numerator);
    }

    public boolean LessOrEqual(Fraction fraction) {
        return (this.numerator * fraction.denominator) <= (this.denominator * fraction.numerator);
    }

    public boolean GreaterOrEqual(Fraction fraction) {
        return (this.numerator * fraction.denominator) >= (this.denominator * fraction.numerator);
    }

    public String toString() {
        return "(" + Integer.toString(this.numerator) + "/" + Integer.toString(this.denominator) + ")";
    }
}
