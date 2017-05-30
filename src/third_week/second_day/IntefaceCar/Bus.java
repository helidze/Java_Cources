package third_week.second_day.IntefaceCar;

/**
 * Created by George on 30.05.2017.
 */
public class Bus extends Car implements PassengerCar {
    @Override
    public void passengerCar() {

    }

    public void drive(){
        System.out.println("Bus Ride");
    }
}
