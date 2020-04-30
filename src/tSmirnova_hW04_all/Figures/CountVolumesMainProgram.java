package tSmirnova_hW04_all.Figures;

import java.util.ArrayList;
import java.util.List;

public class CountVolumesMainProgram {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();

        Box box = new Box(2);

        Shape pyramid = new Pyramid(10, 3);
        Shape cylinder = new Cylinder(2, 2);
        Shape ball = new Ball(10);

        shapes.add(pyramid);
        shapes.add(cylinder);
        shapes.add(ball);

        int counter = 0;
        for (Shape figure : shapes) {
            if (!box.add(figure)) {
                System.out.println("There are " + counter + " figures in the box");
                System.out.println("It's impossible to add figure : " + figure.toString());
                break;
            } else {
                counter++;
            }
        }
        if (counter == shapes.size()) {
            System.out.println("All shapes are allowed");
        }
    }
}