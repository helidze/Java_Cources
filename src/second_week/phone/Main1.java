package second_week.phone;

/**
 * Created by george.helidze on 5/26/2017.
 */
public class Main1 {


    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.newContact("Alyosha",80937255340L);
        phone.showContacts();
    }
}
