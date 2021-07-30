package vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components;

/**
 * vn.edu.hcmus.fit.ndhuy.designpattern.factorymethod.components
 * Created by ndhuy
 * Date 30/07/2021 - 10:39
 * Description: factory method
 */
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "RMIT - HCM city";
    }

    public GPSNavigator(String manualRoute){
        this.route = manualRoute;
    }

    public String getRoute() {
        return this.route;
    }
}
