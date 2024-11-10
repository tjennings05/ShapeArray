abstract class Shape {
    abstract double surface_area();
    abstract double volume();
}

class Sphere extends Shape {
    private double radius;

    public Sphere(double rad) {
        this.radius = rad;
    }

    public double volume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }

    public double surface_area() {
        return 4 * Math.PI * radius * radius;
    }

    public String toString() {
        return "Surface Area of Sphere: " + surface_area() + "\nVolume of Sphere: " + volume();
    }
}

class Cylinder extends Shape {
    private double radius, height;

    public Cylinder(double rad, double h) {
        this.radius = rad;
        this.height = h;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public double surface_area() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
    }

    public String toString() {
        return "Surface Area of Cylinder: " + surface_area() + "\nVolume of Cylinder: " + volume();
    }
}

class Cone extends Shape {
    private double radius, height;

    public Cone(double rad, double h) {
        this.radius = rad;
        this.height = h;
    }

    public double volume() {
        return (Math.PI * radius * radius * height) / 3;
    }

    public double surface_area() {
        return Math.PI * radius * (radius + Math.sqrt((height * height) + (radius * radius)));
    }

    public String toString() {
        return "Surface Area of Cone: " + surface_area() + "\nVolume of Cone: " + volume();
    }
}

public class ShapeArray {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[3];
        shapeArray[0] = new Sphere(3); // radius = 3
        shapeArray[1] = new Cylinder(3, 4); // radius = 3, height = 4
        shapeArray[2] = new Cone(3, 5); // radius = 3, height = 5

        for (int i = 0; i < shapeArray.length; i++) {
            System.out.println(shapeArray[i]);
        }
    }
}