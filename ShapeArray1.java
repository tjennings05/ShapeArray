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