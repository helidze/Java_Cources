package second_week.Car2;

/**
 * Created by George on 24.05.2017.
 */
public class Car2 {

    private String model;
    private String color;
    private int year;
    public int tankFuel = 100;
    public int fuelconsumpion = 10;


    public Car2(String model, String color) {
        this.model = model; //инициализация всех полей конструктора
        this.color = color;
    }

    public Car2(String model, String color, int year) {
        this(model, color);
        this.year = year;

    }

    public void info() {
        System.out.println("Model: " + this.model + "\nColor: " + this.color +
                "\nYear: " + this.year + "\nTankFuel: " + tankFuel + "\nfuelConsumption: " + fuelconsumpion);
    }


    public void startStop() {
        if (tankFuel > 0) {
            System.out.println("Your car start");
        } else {
            System.out.println("Your fuel ends");
        }
    }

    public void refuel() {
        setTankFuel(100);
    }

    public int getTankFuel() {
        return tankFuel;
    }

    public void setTankFuel(int tankFuel) {
        this.tankFuel = tankFuel;
    }

    public void go() {
        for (int i = 0; i < tankFuel; i++) {
            tankFuel = tankFuel - fuelconsumpion;
            System.out.println("go while we have: " + tankFuel + "gas");
            if (tankFuel == 0) {
                System.out.println("Please Refuel");
                refuel();

            }
        }
    }
}

