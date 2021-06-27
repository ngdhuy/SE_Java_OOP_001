package vn.edu.hcmus.fit.ndhuy.polygon;

/**
 * vn.edu.hcmus.fit.ndhuy.polygon
 * Created by ndhuy
 * Date 26/06/2021 - 10:46
 * Description: ...
 */
public class Circle implements PolygonInterface {
    private Point2D center;
    private double radius;

    public Circle() {
        this.center = new Point2D();
        this.radius = 0;
    }

    public Circle(Point2D center, double radius) {
        this.center = new Point2D(center);
        this.radius = radius;
    }

    public Circle(Circle circle) {
        this.center = new Point2D(circle.center);
        this.radius = circle.radius;
    }

    public Point2D getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    @Override
    public double calAcreage() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double calPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return String.format("Circle: r = %f, center = %s", this.radius, this.center.toString());
    }

    @Override
    public String objectToString() {
        return String.format("Circle|%f|%s", this.radius, this.center.objectToString());
    }

    @Override
    public void stringToObject(String string) {
        String[] arrString = string.split("\\|");
        // Circle|10.5|2,3 -> arrString = ["Circle", "10.5", "2,3"]
        this.radius = Double.parseDouble(arrString[1]);
        this.center = Point2D.parsePoint2D(arrString[2]);
    }
}