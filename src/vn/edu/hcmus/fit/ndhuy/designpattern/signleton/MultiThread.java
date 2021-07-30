package vn.edu.hcmus.fit.ndhuy.designpattern.signleton;

/**
 * vn.edu.hcmus.fit.ndhuy.designpattern.signleton
 * Created by ndhuy
 * Date 24/07/2021 - 20:34
 * Description: Singleton Pattern
 */
public class MultiThread {
    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());

        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
