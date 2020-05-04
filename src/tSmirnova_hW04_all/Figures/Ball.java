package tSmirnova_hW04_all.Figures;

public class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        this.radius = radius;
    }

    @Override
    protected double getVolume() {
        return Math.PI * Math.pow(this.getRadius(), 3) * 4 / 3;
    }

    public String toString() {
        return "Ball. Radius = " + radius;
    }
}