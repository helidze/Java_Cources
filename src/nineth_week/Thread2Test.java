package nineth_week;

/**
 * Created by George on 10.07.2017.
 */
public class Thread2Test {

    public static void main(String[] args) {
        Threads threads0 = new Threads("thread0");
        Threads threads1 = new Threads("thread1");
        Threads threads2 = new Threads("thread2");

        threads0.run();
        threads1.run();
        threads2.run();

    }
}
