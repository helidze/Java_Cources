package third_week.Figure;

/**
 * Created by George on 29.05.2017.
 */
public class Triangle extends Figure {
    int c;

    public Triangle(){}

    public Triangle(int a,int b, int c){
        super(a, b);
        this.c = c;
    }

    @Override
    public void about(){
        setA(15);
        setB(10);
        setC(11);
        System.out.println("Сторона треугольника А равна: " + a +
        "\nСторона треугольника B равна: " + b +
        "\nСторона треугольника C равна: " + c);
    }

    @Override
    public void area() {
        setA(15);
        setB(10);
        setC(11);
        System.out.println("Площадь треугольника: " + a*b*c);
    }

    @Override
    public void perimeter() {
        setA(15);
        setB(10);
        setC(11);
        System.out.println("Периметр треугольника: " + (a+b+c));
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
