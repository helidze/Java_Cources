package third_week.second_day.PracticeInterface2;

/**
 * Created by George on 30.05.2017.
 */
public class Lifecell implements Simcard {
    int BALANCE = 70;

    @Override
    public void balance() {
        System.out.println("Balance on lifecell: " + BALANCE + "grn");
    }

    @Override
    public void refillBalance() {
        System.out.println("Balance refilled on lifecell: " + REFILL_BALANCE + "grn");
    }

    @Override
    public void aboutSimcard() {
        System.out.println("This is lifecell Simcard");
    }
}
