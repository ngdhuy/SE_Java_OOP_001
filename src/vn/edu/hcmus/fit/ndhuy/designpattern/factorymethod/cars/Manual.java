package vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.cars;

import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components.Engine;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components.GPSNavigator;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components.Transmission;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components.TripComputer;

/**
 * vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.cars
 * Created by ndhuy
 * Date 30/07/2021 - 11:06
 * Description: Factory method
 */
public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + this.carType + "\n";
        info += "Count of seats: " + this.seats + "\n";
        info += "Engine: volume - " + this.engine.getVolume() + "; mileage - " + this.engine.getMileage() + "\n";
        info += "Transmission: " + this.transmission + "\n";
        if(this.tripComputer != null) {
            info += "Trip Computer: Functional\n";
        } else {
            info += "Trip Computer: N/A\n";
        }
        if(this.gpsNavigator != null){
            info += "GPS Navigator: Functional\n";
        } else {
            info += "GPS Navigator: N/A\n";
        }
        return info;
    }
}
