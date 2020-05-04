package tSmirnova_hW04_all.ExceptionShapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeMainProgram {

    public static void main(String[] args) {
        List<ShapeSquare> shapes = new ArrayList<ShapeSquare>();

        ShapeSquare circle = new CircleShape(0);
        ShapeSquare triangle = new TriangleShape(2, -1);
        ShapeSquare rectangle = new RectangleShape(0, 3);

        shapes.add(circle);
        shapes.add(triangle);
        shapes.add(rectangle);

        for (ShapeSquare shape : shapes)

            try {
                shape.getSquare();
            } catch (ShapeException e) {
                e.printStackTrace();
            }
    }
}