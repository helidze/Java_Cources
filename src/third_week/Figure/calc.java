package third_week.Figure;

/**
 * Created by George on 29.05.2017.
 */
public class calc {
    public static void main(String[] args) {
        Figure figure = new Figure();
        figure.setA(5);
        figure.setB(5);
        figure.about();
        figure.area();
        figure.perimeter();
        System.out.println();
        Square square = new Square();
        square.about();
        square.area();
        square.perimeter();
        System.out.println();
        Triangle triangle = new Triangle();
        triangle.about();
        triangle.area();
        triangle.perimeter();
        System.out.println();
        Rectangle rectangle = new Rectangle();
        rectangle.about();
        rectangle.area();
        rectangle.perimeter();
        System.out.println();
        Circle circle = new Circle();
        circle.about();
        circle.perimeter();
        circle.area();
    }
}
