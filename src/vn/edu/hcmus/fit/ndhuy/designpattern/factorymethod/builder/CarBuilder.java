package vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.builder;

import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.cars.Car;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.cars.CarType;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components.Engine;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components.GPSNavigator;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components.Transmission;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components.TripComputer;

/**
 * vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.builder
 * Created by ndhuy
 * Date 30/07/2021 - 11:24
 * Description: ...
 */
public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(this.type, this.seats, this.engine, this.transmission, this.tripComputer, this.gpsNavigator);
    }
}
