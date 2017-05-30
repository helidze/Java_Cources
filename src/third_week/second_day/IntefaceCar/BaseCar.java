package third_week.second_day.IntefaceCar;

/**
 * Created by George on 30.05.2017.
 */
public interface BaseCar {
    int FUEL_TANK = 60; //константа, пишется с большой буквы


    void start();
    public abstract void stop(); //можно не писать public abstract,это само сабой разумеется
    public abstract void drive();

}
