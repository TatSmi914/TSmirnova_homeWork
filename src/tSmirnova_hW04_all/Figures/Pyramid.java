package tSmirnova_hW04_all.Figures;

public class Pyramid extends Shape {

    protected double s;
    protected double h;

    Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    protected double getVolume() {
        return (h * s)/3;
    }

    public String toString() {
        return "Pyramid. Height = " + h + ", Square = " + s;
    }
}