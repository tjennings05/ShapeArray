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
