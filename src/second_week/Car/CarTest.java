package second_week.Car;

/**
 * Created by George on 24.05.2017.
 */
public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Black";
        car1.model = "Mazda3";
        car1.year = 2017;
        car1.info();
        car1.princar();

        System.out.println();

        Car car2 = new Car();
        car2.color = "White";
        car2.model = "Honda Accord";
        car2.year = 2010;
        car2.info();
        car2.princar();
    }
}