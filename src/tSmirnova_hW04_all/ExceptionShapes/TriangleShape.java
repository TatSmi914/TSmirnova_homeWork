package tSmirnova_hW04_all.ExceptionShapes;

import tSmirnova_hW04_all.ExceptionShapes.ShapeException;
import tSmirnova_hW04_all.ExceptionShapes.ShapeSquare;

public class TriangleShape extends ShapeSquare {

    private double height;
    private double d;

    public TriangleShape(double height, double d) {
        this.height = height;
        this.d = d;
    }

    @Override
    public void getSquare() throws ShapeException {
        double square = (height * d) / 2;

        if (square > 0) {
            System.out.println("Triangle square :" + square);
        } else {
            throw new ShapeException("Triangle parameters are NOT correct!");
        }
    }
}