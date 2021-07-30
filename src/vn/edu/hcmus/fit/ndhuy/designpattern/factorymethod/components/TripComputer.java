package vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components;

import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.cars.Car;

/**
 * vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components
 * Created by ndhuy
 * Date 30/07/2021 - 10:42
 * Description: factory method
 */
public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showSatus() {
        if(this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
