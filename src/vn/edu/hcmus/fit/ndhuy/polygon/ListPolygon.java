package vn.edu.hcmus.fit.ndhuy.polygon;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.ndhuy.polygon
 * Created by ndhuy
 * Date 27/06/2021 - 10:25
 * Description: ...
 */
public class ListPolygon {
    private ArrayList<PolygonInterface> polygons;

    public ListPolygon() {
        this.polygons = new ArrayList<PolygonInterface>();
    }

    public ArrayList<PolygonInterface> getPolygons() {
        return polygons;
    }

    public void setPolygons(ArrayList<PolygonInterface> polygons) {
        this.polygons = polygons;
    }

    public PolygonInterface getByIndex(int index) {
        if (0 < index && index < polygons.size())
            return polygons.get(index);
        else
            return null;
    }

    public void add(PolygonInterface polygon) {
        this.polygons.add(polygon);
    }

    public void print() {
        for (PolygonInterface polygon : this.polygons) {
            System.out.println(polygon.toString());
        }
    }

    public void saveToFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                FileWriter writer = new FileWriter(file);
                for(PolygonInterface polygon : this.polygons) {
                    writer.write(polygon.objectToString());
                }
                writer.close();
            }
        } catch (IOException e) {
            System.out.println("Cannot access file " + fileName);
            e.printStackTrace();
        }
    }

    public void loadFromFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()) {
                String string = scanner.nextLine();
                switch (string.split("\\|")[0]) {
                    case "Circle" -> {
                        Circle circle = new Circle();
                        circle.stringToObject(string);
                        this.polygons.add(circle);
                    }
                    case "Rectangle" -> {
                        Rectangle rectangle = new Rectangle();
                        rectangle.stringToObject(string);
                        this.polygons.add(rectangle);
                    }
                    case "Triangle" -> {
                        Triangle triangle = new Triangle();
                        triangle.stringToObject(string);
                        this.polygons.add(triangle);
                    }
                }
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Cannot access file " + fileName);
            e.printStackTrace();
        }
    }
}
