package vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.builder;

import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.cars.CarType;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components.Engine;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components.GPSNavigator;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components.Transmission;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components.TripComputer;

/**
 * vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod
 * Created by ndhuy
 * Date 30/07/2021 - 10:22
 * Description: Factory method
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
