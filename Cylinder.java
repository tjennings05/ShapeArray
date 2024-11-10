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
