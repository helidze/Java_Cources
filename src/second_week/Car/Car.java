package second_week.Car;

/**
 * Created by George on 24.05.2017.
 */
public class Car {
    public String model;
    protected String color;
    public int year;




    public void info(){
        System.out.println("Model: " + model + "\n Color: " + color + "\n Year" + year);
    }
    public static void princar(){
        System.out.println("Car my car");
    }
}
