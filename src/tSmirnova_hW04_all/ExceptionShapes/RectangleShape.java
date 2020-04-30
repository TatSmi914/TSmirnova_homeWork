package tSmirnova_hW04_all.ExceptionShapes;

public class RectangleShape extends ShapeSquare {

    private double a;
    private double b;

    public RectangleShape (double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void getSquare() throws ShapeException {
        double square =  a * b * 2;

        if (square > 0) {
            System.out.println("Rectangle square :" + square);
        } else {
            throw new ShapeException("Rectangle parameters are NOT correct!" + square);
        }
    }
}