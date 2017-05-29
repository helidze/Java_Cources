package third_week.Figure;

/**
 * Created by George on 29.05.2017.
 */
public class Circle extends Figure {
    int diametr;

    public Circle(){}

    public Circle(int diametr){
        this.diametr = diametr;
    }

    @Override
    public void about(){
        setDiametr(20);
        System.out.println("Диаметр круга равен: " + diametr);
    }

    @Override
    public void area() {
        setA(15);
        System.out.println("Radius круга: " + diametr/2);
    }

    @Override
    public void perimeter() {
        setA(15);
        System.out.println("Периметр круга: " + (a+a));
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }
}
