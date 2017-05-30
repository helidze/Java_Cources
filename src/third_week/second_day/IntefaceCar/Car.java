package third_week.second_day.IntefaceCar;

/**
 * Created by George on 30.05.2017.
 */
public class Car implements BaseCar {
    final static int FUEL_TANK = 70;
    
    @Override
    public void start() {
        System.out.println("CAR START");
    }

    @Override
    public void stop() {
        System.out.println("CAR STOP");
    }

    @Override
    public void drive() {
        System.out.println("CAR DRIVE");
    }
}
