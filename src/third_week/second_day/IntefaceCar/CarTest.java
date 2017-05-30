package third_week.second_day.IntefaceCar;

/**
 * Created by George on 30.05.2017.
 */
public class CarTest {
    public static void main(String[] args) {

//        Car car = new Car();
//        car.start();
//        car.stop();
//        car.drive();
//        System.out.println("Fuel tank: " + car.FUEL_TANK);

        Bus bus = new Bus();
        Truck truck = new Truck();
        Pickup pickup = new Pickup();

        bus.start();
        bus.drive();
        bus.stop();
        bus.passengerCar();
        System.out.println();

        truck.start();
        truck.stop();
        truck.drive();
        truck.carGo();
        System.out.println();

        pickup.carGo();
        pickup.passengerCar();
        pickup.drive();
        pickup.start();
        pickup.stop();
    }


}
