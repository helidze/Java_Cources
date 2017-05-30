package third_week.second_day.PracticeInterface2;

/**
 * Created by George on 30.05.2017.
 */
public class Kyivstar implements Simcard {
    int BALANCE = 100;


    @Override
    public void balance() {
        System.out.println("Balance on Kyivstar: " + BALANCE + "grn");
    }

    @Override
    public void refillBalance() {
        System.out.println("Balance refilled on KyivStar: " + REFILL_BALANCE + "grn");
    }

    @Override
    public void aboutSimcard() {
        System.out.println("This is Kyivstar Simcard");

    }
}
