package vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components;

/**
 * vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components
 * Created by ndhuy
 * Date 30/07/2021 - 10:30
 * Description: factory method
 */
public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on() {
        this.started = true;
    }

    public void off() {
        this.started = false;
    }

    public boolean isStarted() {
        return this.started;
    }

    public void go(double mileage) {
        if(started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}