package vn.edu.hcmus.fit.ndhuy.designpattern.signleton;

/**
 * vn.edu.hcmus.fit.ndhuy.designpattern.signleton
 * Created by ndhuy
 * Date 24/07/2021 - 20:50
 * Description: ...
 */
public class MultiThreadAdvance {
    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());

        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonAdvance singletonAdvance = SingletonAdvance.getInstance("FOO");
            System.out.println(singletonAdvance.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonAdvance singletonAdvance = SingletonAdvance.getInstance("BAR");
            System.out.println(singletonAdvance.value);
        }
    }
}
