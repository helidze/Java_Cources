package third_week;

/**
 * Created by George on 29.05.2017.
 */
public class InheritenceCar {
    private String model;
    private String color;
    private int year;
    private int number;

    public InheritenceCar(){}



    public InheritenceCar(String model, String color, int year, int number) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.number = number;
    }

    public void aboutCar(){
        System.out.println("Model: " + this.model +
                            "\nColor: " + this.color + "\nYear: " +
                                this.year + "\nNumber: " + this.number);
    }

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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
