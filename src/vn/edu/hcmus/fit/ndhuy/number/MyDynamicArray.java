package vn.edu.hcmus.fit.ndhuy.number;

/**
 * vn.edu.hcmus.fit.ndhuy.number
 * Created by ndhuy
 * Date 13/06/2021 - 11:48
 * Description: Define Array Class
 */

public class MyDynamicArray {
    private int[] array;
    private int length;

    public MyDynamicArray() {
        this.length = 0;
        this.array = new int[0];
    }

    public MyDynamicArray(int n) {
        if (n > 0) {
            this.length = n;
            this.array = new int[this.length];
        } else {
            this.length = 0;
            this.array = new int[0];
        }
    }

    public MyDynamicArray(MyDynamicArray myArray) {
        this.length = myArray.length;
        this.array = new int[this.length];
        for (int i = 0 ; i < myArray.length; i++) {
            this.array[i] = myArray.array[i];
        }
    }

    public int[] getArray() {
        return this.array;
    }

    public void setArray(int[] array) {
        this.array = array;
        this.length = this.array.length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String toString() {
        String strResult = "[\t";
        for(int item : this.array) {
            strResult += Integer.toString(item) + "\t";
        }
        strResult += "]";
        return strResult;
    }
}
