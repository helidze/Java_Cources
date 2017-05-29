package third_week.Figure;

/**
 * Created by George on 29.05.2017.
 */
public class Rectangle extends Figure {
    @Override
    public void about(){
        setA(15);
        setB(10);
        System.out.println("Сторона прямоугольника А равна: " + a +
        "\nСторона прямоугольника B равна: " + b);
    }

    @Override
    public void area() {
        setA(15);
        setB(10);
        System.out.println("Площадь прямоугольника: " + a*b);
    }

    @Override
    public void perimeter() {
        setA(15);
        setB(10);
        System.out.println("Периметр прямоугольника: " + (a+b));
    }
}
