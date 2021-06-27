package vn.edu.hcmus.fit.ndhuy.polygon;

/**
 * vn.edu.hcmus.fit.ndhuy.polygon
 * Created by ndhuy
 * Date 26/06/2021 - 10:49
 * Description: ...
 */
public class Point2D {
    private int x;
    private int y;

    public Point2D() {
        this.x = this.y = 0;
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point2D(Point2D point) {
        this.x = point.x;
        this.y = point.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanceTo(Point2D point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }

    public String objectToString() {
        return String.format("%d,%d", this.x, this.y);
    }

    public static Point2D parsePoint2D(String string) {
        String[] arrString = string.split(",");
        Point2D point = new Point2D();
        point.x = Integer.parseInt(arrString[0]);
        point.y = Integer.parseInt(arrString[1]);
        return point;
    }
}
