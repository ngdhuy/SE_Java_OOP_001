package vn.edu.hcmus.fit.ndhuy.se_06_java_oop;

import com.sun.source.tree.TryTree;
import org.w3c.dom.css.Rect;
import vn.edu.hcmus.fit.ndhuy.polygon.*;
import vn.edu.hcmus.fit.ndhuy.polygon.Rectangle;

import java.awt.*;
import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.concurrent.RecursiveAction;

public class Main {

    public static void main(String[] args) {
        ArrayList<PolygonInterface> arrPolygon = new ArrayList<PolygonInterface>();
        Circle c = new Circle(new Point2D(2, 3), 5);
        Rectangle r1 = new Rectangle(new Point2D(4, 7), 18, 20);
        Rectangle r2 = new Rectangle(new Point2D(1, 1), 5, 8);
        Triangle t = new Triangle(new Point2D(0, 0), new Point2D(2, 0), new Point2D(0, 3));

        arrPolygon.add(c);
        arrPolygon.add(r1);
        arrPolygon.add(r2);
        arrPolygon.add(t);

        for (PolygonInterface poly : arrPolygon) {
            System.out.println(poly);
        }
    }
}
