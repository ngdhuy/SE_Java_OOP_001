package vn.edu.hcmus.fit.ndhuy.number;

/**
 * vn.edu.hcmus.fit.ndhuy.number
 * Created by ndhuy
 * Date 14/06/2021 - 10:17
 * Description: Number class
 */

public class Number {
    public int value;

    public Number(int value) {
        this.value = value;
    }

    public Number(Number number) {
        this.value = number.value;
    }

    public String toString() {
        return Integer.toString(this.value);
    }
}
