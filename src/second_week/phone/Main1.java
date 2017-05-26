package second_week.phone;

/**
 * Created by george.helidze on 5/26/2017.
 */
public class Main1 {


    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.newContact("Alyosha",80937255340L);
        phone.newContact("Alyosha1",809372553140L);
        phone.newContact("Alyosha2",809372553240L);
        phone.newContact("Alyosha3",809372553430L);
        phone.showContacts();

        phone.setSimCard(true);
        phone.call();

    }
}
