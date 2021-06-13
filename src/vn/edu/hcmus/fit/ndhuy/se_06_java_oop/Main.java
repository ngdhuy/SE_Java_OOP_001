package vn.edu.hcmus.fit.ndhuy.se_06_java_oop;

import vn.edu.hcmus.fit.ndhuy.number.Fraction;
import vn.edu.hcmus.fit.ndhuy.number.MyDynamicArray;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        MyDynamicArray myArray = new MyDynamicArray();
        myArray.setArray(arr);
        System.out.println(myArray);
    }
}
