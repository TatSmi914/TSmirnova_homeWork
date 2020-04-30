package tSmirnova_hW04_all.Figures;

public class Cylinder extends SolidOfRevolution {

    protected double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    protected double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public String toString() {
        return "Cylinder. Height = " + height + ", Radius = " + radius;
    }
}