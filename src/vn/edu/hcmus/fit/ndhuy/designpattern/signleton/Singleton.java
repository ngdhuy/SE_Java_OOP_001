package vn.edu.hcmus.fit.ndhuy.designpattern.signleton;

/**
 * vn.edu.hcmus.fit.ndhuy.designpattern.signleton
 * Created by ndhuy
 * Date 24/07/2021 - 20:13
 * Description: Singleton patter
 */
public class Singleton {
    private static Singleton instance;
    public String value;    // data of object

    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if(instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
