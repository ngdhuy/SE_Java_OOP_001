package vn.edu.hcmus.fit.ndhuy.polygon;

import java.util.concurrent.Semaphore;

/**
 * vn.edu.hcmus.fit.ndhuy.polygon
 * Created by ndhuy
 * Date 26/06/2021 - 11:18
 * Description: ...
 */
public class Rectangle implements PolygonInterface {
    private Point2D pointLeftUp;
    private double width;
    private double height;

    public Rectangle() {
        this.pointLeftUp = new Point2D();
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(Point2D pointLeftUp, double width, double height) {
        this.pointLeftUp = new Point2D(pointLeftUp);
        this.width = (width < 0) ? 0 : width;
        this.height = (height < 0) ? 0 : height;
    }

    public Rectangle(Rectangle rectangle) {
        this.pointLeftUp = new Point2D(rectangle.pointLeftUp);
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public Point2D getPointLeftUp() {
        return pointLeftUp;
    }

    public void setPointLeftUp(Point2D pointLeftUp) {
        this.pointLeftUp = pointLeftUp;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calAcreage() {
        return this.width * this.height;
    }

    @Override
    public double calPerimeter() {
        return 2 * (this.width + this.height);
    }

    public String toString() {
        return  String.format("Rectangle: width = %f, height = %f, point left up %s", this.width, this.height, this.pointLeftUp.toString());
    }

    @Override
    public String objectToString() {
        return String.format("Rectangle|%f|%f|%s", this.width, this.height, this.pointLeftUp.objectToString());
    }

    @Override
    public void stringToObject(String string) {
        String[] arrString = string.split("\\|");
        this.width = Double.parseDouble(arrString[1]);
        this.height = Double.parseDouble(arrString[2]);
        this.pointLeftUp = Point2D.parsePoint2D(arrString[3]);
    }
}
