package vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.director;

import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.builder.Builder;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.cars.CarType;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components.Engine;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components.GPSNavigator;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components.Transmission;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components.TripComputer;

/**
 * vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.director
 * Created by ndhuy
 * Date 30/07/2021 - 11:36
 * Description: ...
 */
public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(5);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(7);
        builder.setEngine(new Engine(3.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
