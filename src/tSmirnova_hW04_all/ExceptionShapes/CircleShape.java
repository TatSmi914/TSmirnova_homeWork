package tSmirnova_hW04_all.ExceptionShapes;

public class CircleShape extends ShapeSquare {

    private double radius;

    public CircleShape (double radius) {
        this.radius = radius;
    }

    @Override
    public void getSquare() throws ShapeException {
        double square = radius * radius * Math.PI;

        if (square > 0) {
            System.out.println("Circle square :" + square);
        } else {
            throw new ShapeException("Circle parameters are NOT correct!");
        }
    }
}