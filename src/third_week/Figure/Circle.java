package third_week.Figure;

/**
 * Created by George on 29.05.2017.
 */
public class Circle extends Figure {
    @Override
    public void about(){
        setA(15);
        System.out.println("Сторона круга равна: " + a);
    }

    @Override
    public void area() {
        setA(15);
        System.out.println("Площадь круга: " + a*a);
    }

    @Override
    public void perimeter() {
        setA(15);
        System.out.println("Периметр круга: " + (a+a));
    }
}
