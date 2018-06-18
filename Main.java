import java.util.ArrayList;

import javax.sound.midi.SysexMessage;

import org.w3c.dom.css.Rect;

public class Main {

    public static void main(String[] args) {

        Circle c = new Circle(1);
        Rectangle r = new Rectangle(3, 5);

        ArrayList<Shape> shapesList = new ArrayList<>();

        shapesList.add(c);
        shapesList.add(r);

        System.out.print("Total area: " + sumAreaOfList(shapesList));

    }

    public static double sumAreaOfList(ArrayList<Shape> shapesList) {

        double sum = 0;

        for (Shape s : shapesList) {
            sum += s.getArea();
        }

        return sum;

    }

}
