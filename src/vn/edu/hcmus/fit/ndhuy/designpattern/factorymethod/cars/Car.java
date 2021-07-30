package vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.cars;

import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components.Engine;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components.GPSNavigator;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components.Transmission;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components.TripComputer;

/**
 * vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.cars
 * Created by ndhuy
 * Date 30/07/2021 - 10:49
 * Description: ...
 */
public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if(this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType() {
        return  this.carType;
    }

    public double getFuel() {
        return this.fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return this.seats;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public TripComputer getTripComputer() {
        return this.tripComputer;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }
}
