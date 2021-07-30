package vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod;

import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.builder.CarBuilder;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.builder.CarManualBuilder;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.cars.Car;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.cars.Manual;
import vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.director.Director;

/**
 * vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod
 * Created by ndhuy
 * Date 30/07/2021 - 11:44
 * Description: ...
 */
public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
