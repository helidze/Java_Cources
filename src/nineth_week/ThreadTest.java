package nineth_week;

/**
 * Created by George on 10.07.2017.
 */
public class ThreadTest {
    public static void main(String[] args) {
        Threads threads0 = new Threads("\tthread0");
        Threads threads1 = new Threads("\t\tthread1");
        Threads threads2 = new Threads("\t\t\tthread2");


        threads0.start();
        threads0.setPriority(10);
        threads1.start();
        threads2.start();




    }
}
