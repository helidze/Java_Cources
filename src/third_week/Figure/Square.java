package third_week.Figure;

/**
 * Created by George on 29.05.2017.
 */
public class Square extends Figure {

        @Override
        public void about(){
            setA(15);
            System.out.println("Сторона квадрата равна: " + a);
        }

    @Override
    public void area() {
        setA(15);
        System.out.println("Площадь квадрата: " + a*a);
    }

    @Override
    public void perimeter() {
        setA(15);
        System.out.println("Периметр квадрата: " + (a+a));
    }
}
