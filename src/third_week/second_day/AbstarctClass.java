package third_week.second_day;

/**
 * Created by George on 30.05.2017.
 */
public abstract class AbstarctClass {

    public void printAbout(){
        System.out.println(getClass().getName());
    }

    public abstract void print();
}
