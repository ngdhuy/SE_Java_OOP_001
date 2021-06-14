package vn.edu.hcmus.fit.ndhuy.number;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.nio.channels.NotYetBoundException;
import java.util.Scanner;

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

    public MyDynamicArray(int[] arr) {
        this.length = arr.length;
        this.array = new int[this.length];
        for(int i = 0; i < this.length; i++) {
            this.array[i] = arr[i];
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

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int temp = scan.nextInt();
        if (temp > 0) {
            this.length = temp;
            this.array = new int[this.length];
            for (int i = 0; i < this.length; i++) {
                System.out.print(String.format("a[%d] = ", i));
                this.array[i] = scan.nextInt();
            }
        }
    }

    public void output() {
        System.out.println(this.toString());
    }

    public void sortIncrease() {
        for (int i = 0; i < this.length - 1; i++) {
            for (int j = i + 1; j < this.length; j++) {
                if (this.array[i] > this.array[j]) {
                    Number a = new Number(this.array[i]);
                    Number b = new Number(this.array[j]);
                    MyMath.swap(a, b);
                    this.array[i] = a.value;
                    this.array[j] = b.value;
                }
            }
        }
    }

    public void sortDecrease() {
        for (int i = 0; i < this.length - 1; i++) {
            for (int j = i + 1; j < this.length; j++) {
                if (this.array[i] < this.array[j]) {
                    int temp = this.array[i];
                    this.array[i] = this.array[j];
                    this.array[j] = temp;
                }
            }
        }
    }

    public int sumValue() {
        int result = 0;
        for (int item : this.array) {
            result += item;
        }
        return result;
    }

    public int mulValue() {
        int result = 0;
        if (this.length > 0) {
            result = 1;
            for (int item : this.array) {
                result *= item;
            }
        }
        return result;
    }

    public int getIndexMinPositive() {
        int index = -1;
        for(int i = 0; i < this.length; i++) {
            if (this.array[i] > 0 && (index == -1 || this.array[i] < this.array[index])) {
                index = i;
            }
        }
        return index;
    }

    public int getIndexMaxNagative() {
        int index = -1;
        for(int i = 0; i < this.length; i++) {
            if (this.array[i] < 0 && (index == -1 || this.array[i] < this.array[index])) {
                index = i;
            }
        }
        return index;
    }

    public void insertHead(int value) {
        int[] tempArray = new int[this.length];
        for(int i = 0; i < this.length; i++) {
            tempArray[i] = this.array[i];
        }

        this.length++;
        this.array = new int[this.length];
        this.array[0] = value;

        int i = 1;
        for(int item : tempArray) {
            this.array[i++] = item;
        }
    }

    public void insertTail(int value) {
        int[] tempArray = new int[this.length];
        for(int i = 0; i < this.length; i++) {
            tempArray[i] = this.array[i];
        }

        this.length++;
        this.array = new int[this.length];
        int i = 0;
        for(int item : tempArray) {
            this.array[i++] = item;
        }
        this.array[i] = value;
    }

    public void insertAt(int value, int index) {
        int[] tempArray = new int[this.length];
        for(int i = 0; i < this.length; i++) {
            tempArray[i] = this.array[i];
        }

        this.length++;
        this.array = new int[this.length];
        int i = 0;
        for(i = 0; i < index; i++) {
            this.array[i] = tempArray[i];
        }
        this.array[i++] = value;
        while(i < this.length){
            this.array[i] = tempArray[i - 1];
            i++;
        }
    }

    public void removeAt(int index) {
        int[] tempArray = new int[this.length - 1];
        int i = 0;
        int j = 0;
        while(i < this.length) {
            if (i != index) {
                tempArray[j++] = this.array[i];
            }
            i++;
        }
        this.length--;
        this.array = new int[this.length];
        for(i = 0; i < this.length; i++) {
            this.array[i] = tempArray[i];
        }
    }

    public void removeAll(int value) {
        int[] tempArray = new int[this.length];
        int i = 0;
        for (int item : this.array) {
            if (item != value)
                tempArray[i++] = item;
        }

        this.length = i;
        this.array = new int[this.length];
        for( i = 0; i < this.length; i++)
            this.array[i] = tempArray[i];
    }

    public void updateAt(int value, int index) {
        if (0 <= index && index < this.length) {
            this.array[index] = value;
        }
    }

    public void updateAll(int oldValue, int newValue) {
        for(int i = 0; i < this.length; i++) {
            if (this.array[i] == oldValue) {
                this.array[i] = newValue;
            }
        }
    }

    public static MyDynamicArray parseMyDynamicArray(String str, String regex) {
        String[] arrStr = str.split(regex);
        try {
            int[] arr = new int[arrStr.length];
            for (int i = 0; i < arrStr.length; i++) {
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            MyDynamicArray myArray = new MyDynamicArray(arr);
            return myArray;
        } catch (Exception ex) {
            System.out.println("Cannot convert String to Array because String contain non-number item");
            return null;
        }
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
