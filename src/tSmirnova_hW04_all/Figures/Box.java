package tSmirnova_hW04_all.Figures;

public class Box extends Shape {

    Box(double volume) {
        this.volume = volume;
    }

    @Override
    public double getVolume() {
        return this.volume;
    }

    public boolean add(Shape shape){
        boolean result;
        if (this.volume > shape.getVolume()){
            this.volume = this.volume - shape.getVolume();
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}