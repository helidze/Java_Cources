package third_week.second_day.IntefaceCar;

/**
 * Created by George on 30.05.2017.
 */
public class Pickup extends Car implements CargoCar,PassengerCar {
    @Override
    public void carGo() {
        System.out.println("PickUp carGo");
    }

    @Override
    public void passengerCar() {
        System.out.println("Pickup Passenger");
    }

    @Override
    public void start() {
        System.out.println("Pickup Start");
    }

    @Override
    public void stop() {
        System.out.println("Pickup Stop");
    }

    @Override
    public void drive() {
        System.out.println("Pickup Stop");
    }
}
