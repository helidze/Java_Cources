package third_week;

/**
 * Created by George on 29.05.2017.
 */
public class Truck extends InheritenceCar {
    int capacity;

    public Truck() {
    }

    public Truck(String model, String color, int year, int number,int cap) {
        super(model, color, year, number);
        this.capacity = cap;
    }

    @Override
    public void aboutCar() {
        System.out.println("Model: " + this.getModel() +
                "\nColor: " + this.getColor() + "\nYear: " +
                this.getYear() + "\nNumber: " + this.getNumber() + "\nCapacity: " + this.capacity);
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Model: " + this.getModel() +
                "\nColor: " + this.getColor() + "\nYear: " +
                this.getYear() + "\nNumber: " + this.getNumber() + "\nCapacity: " + this.capacity);
        return stringBuilder.toString() ;
    }
}
