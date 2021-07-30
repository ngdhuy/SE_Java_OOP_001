package vn.edu.hcmus.fit.ndhuy.designpattern.signleton;

/**
 * vn.edu.hcmus.fit.ndhuy.designpattern
 * Created by ndhuy
 * Date 24/07/2021 - 20:09
 * Description: main of Design Pattern
 */
public class Run {
    public static void main(String[] args) {
        Singleton single = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");

        System.out.println(single.value);
        System.out.println(anotherSingleton.value);

        System.out.println("=> DONE");
    }
}
