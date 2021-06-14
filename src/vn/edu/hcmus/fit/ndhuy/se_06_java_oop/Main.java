package vn.edu.hcmus.fit.ndhuy.se_06_java_oop;

import vn.edu.hcmus.fit.ndhuy.number.Fraction;
import vn.edu.hcmus.fit.ndhuy.number.MyDynamicArray;

public class Main {

    public static void main(String[] args) {
        int[] arr = {8, 5, 9, 4, 7, 2, 6, 1, 3, 0, 2};
        MyDynamicArray myArray = new MyDynamicArray();
        myArray.setArray(arr);
        myArray.output();
        myArray.sortIncrease();
        myArray.output();
        myArray.sortDecrease();
        myArray.output();
        myArray.insertHead(100);
        myArray.output();
        myArray.insertTail(888);
        myArray.output();
        myArray.insertAt(0, 5);
        myArray.output();
//        myArray.removeAt(5);
//        myArray.output();
        myArray.removeAll(0);
        myArray.output();
        myArray.updateAt(100, 5);
        myArray.output();
        myArray.updateAll(100, 65);
        myArray.output();

        String str = "1 2 3 4 5 6 a 8 9 0";
        MyDynamicArray resultArray = MyDynamicArray.parseMyDynamicArray(str, " ");
        if (resultArray != null)
            resultArray.output();
    }
}
