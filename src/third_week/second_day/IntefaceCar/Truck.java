package third_week.second_day.IntefaceCar;

/**
 * Created by George on 30.05.2017.
 */
public class Truck extends Car implements CargoCar {


    @Override
    public void carGo() {

    }

    public void drive(){
        System.out.println("Truck car drive");
    }
}
