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

