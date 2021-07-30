package vn.edu.hcmus.fit.ndhuy.designpattern.signleton;

/**
 * vn.edu.hcmus.fit.ndhuy.designpattern.signleton
 * Created by ndhuy
 * Date 24/07/2021 - 20:45
 * Description: Singleton pattern
 */
public class SingletonAdvance {
    private static volatile SingletonAdvance instance;
    public String value;

    private SingletonAdvance(String value) {
        this.value = value;
    }

    public static SingletonAdvance getInstance(String value) {
        SingletonAdvance result = instance;
        if(result != null) {
            return result;
        }

        synchronized (SingletonAdvance.class) {
            if(instance == null) {
                instance = new SingletonAdvance(value);
            }
            return instance;
        }
    }
}
