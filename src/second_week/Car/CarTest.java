package second_week.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by George on 24.05.2017.
 */
public class CarTest {
    public static void main(String[] args) {

        ArrayList<Car> list = new ArrayList<>();

        list.add(new Car("Model", "Black", 1989));
        list.add(new Car("Bmw", "Red", 2011));
        list.add(new Car("Mercedes", "Blue", 2012));
        list.add(new Car("Honda", "Yellow", 2013));
        list.add(new Car("Chrysler", "Grey", 2017));
        list.add(new Car("Volkswagen", "White", 2000));
        list.add(new Car("Daewoo", "Purple", 2020));

        Collections.sort(list, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getModel().length() - o2.getModel().length();
            }
        }.thenComparing(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getYear() - o2.getYear();
            }
        }));

        Collections.sort(list);

        System.out.println(list);


//        Car car1 = new Car();
//        car1.color = "Black";
//        car1.model = "Mazda3";
//        car1.year = 2017;
//        car1.info();
//        car1.princar();
//
//        System.out.println();
//
//        Car car2 = new Car();
//        car2.color = "White";
//        car2.model = "Honda Accord";
//        car2.year = 2010;
//        car2.info();
//        car2.princar();
//    }
    }
}