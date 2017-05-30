package third_week.second_day.PracticeInterface2;

/**
 * Created by George on 30.05.2017.
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Kyivstar kyivstar = new Kyivstar();
        phone.aboutPhone("Iphone","Mark");
        kyivstar.balance();
        kyivstar.refillBalance();
        kyivstar.aboutSimcard();

        phone.addSimcard();
    }
}
