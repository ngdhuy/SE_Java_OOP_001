package vn.edu.hcmus.fit.ndhuy.number;

/**
 * vn.edu.hcmus.fit.ndhuy.number
 * Created by ndhuy
 * Date 13/06/2021 - 11:49
 * Description: Define Static class MyMath
 */
public class MyMath {
    public static int findLargestCommonDivision(int a, int b) {
        while(a != 0 && b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a + b;
    }

    public static void swap(Number a, Number b) {
        Number temp = new Number(a);
        a.value = b.value ;
        b.value = temp.value;
    }
}
