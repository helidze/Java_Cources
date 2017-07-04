package second_week.Car;

/**
 * Created by George on 24.05.2017.
 */
public class Car implements Comparable<Car> {
    private String model;
    private String color;
    private int year;

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

//    public void info(){
//        System.out.println("Model: " + model + "\n Color: " + color + "\n Year" + year);
//    }
//    public static void princar(){
//        System.out.println("Car my car");
//    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Car o) {
        return this.model.compareTo(o.model);

    }

    @Override
    public String toString() {
        return model + " " + color + " " + year;
    }
}
