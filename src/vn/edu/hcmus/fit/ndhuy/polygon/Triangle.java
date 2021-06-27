package vn.edu.hcmus.fit.ndhuy.polygon;

/**
 * vn.edu.hcmus.fit.ndhuy.polygon
 * Created by ndhuy
 * Date 26/06/2021 - 11:08
 * Description: ...
 */
public class Triangle implements PolygonInterface {
    private Point2D pointA;
    private Point2D pointB;
    private Point2D pointC;

    public Triangle() {
        this.pointA = new Point2D();
        this.pointB = new Point2D();
        this.pointC = new Point2D();
    }

    public Triangle(Point2D pointA, Point2D pointB, Point2D pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Triangle(Triangle triangle) {
        this.pointA = new Point2D(triangle.pointA);
        this.pointB = new Point2D(triangle.pointB);
        this.pointC = new Point2D(triangle.pointC);
    }

    public Point2D getPointA() {
        return pointA;
    }

    public void setPointA(Point2D pointA) {
        this.pointA = pointA;
    }

    public Point2D getPointB() {
        return pointB;
    }

    public void setPointB(Point2D pointB) {
        this.pointB = pointB;
    }

    public Point2D getPointC() {
        return pointC;
    }

    public void setPointC(Point2D pointC) {
        this.pointC = pointC;
    }

    @Override
    public double calAcreage() {
        double p = this.calPerimeter() / 2;
        double a = this.pointA.distanceTo(this.pointB);
        double b = this.pointB.distanceTo(this.pointC);
        double c = this.pointC.distanceTo(this.pointA);

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double calPerimeter() {
        return this.pointA.distanceTo(this.pointB) + this.pointB.distanceTo(this.pointC) + this.pointC.distanceTo(this.pointA);
    }

    public String toString() {
        return String.format("Triangle: A = %s B = %s C = %s", this.pointA.toString(), this.pointB.toString(), this.pointC.toString());
    }

    @Override
    public String objectToString() {
        return String.format("Triangle|%s|%s|%s", this.pointA.objectToString(), this.pointB.objectToString(), this.pointC.objectToString());
    }

    @Override
    public void stringToObject(String string) {
        String[] arrString = string.split("\\|");
        this.pointA = Point2D.parsePoint2D(arrString[1]);
        this.pointB = Point2D.parsePoint2D(arrString[2]);
        this.pointC = Point2D.parsePoint2D(arrString[3]);
    }
}
