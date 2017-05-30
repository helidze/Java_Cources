package third_week.second_day.PracticeInterface2;

/**
 * Created by George on 30.05.2017.
 */
public class Vodafone implements Simcard {
    int BALANCE = 60;

    @Override
    public void balance() {
        System.out.println("Balance on Vodafone: " + BALANCE + "grn");
    }

    @Override
    public void refillBalance() {
        System.out.println("Balance refilled on Vodafone: " + REFILL_BALANCE + "grn");
    }

    @Override
    public void aboutSimcard() {
        System.out.println("This is Vodafone Simcard");
    }
}
