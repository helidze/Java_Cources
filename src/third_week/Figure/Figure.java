package third_week.Figure;

/**
 * Created by George on 29.05.2017.
 */
public class Figure {
    int a;
    int b;

    public void about(){
        System.out.println("a: " + this.a + "\nb: " + this.b);
    }    //Описание фигуры
    public void area(){
        System.out.println(a+b);
    } //Площадь фигуры
    public void perimeter(){
        System.out.println(a*b);
    }//Периметр фигуры
        public Figure(){}

    public Figure(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
