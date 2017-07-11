package nineth_week;

import java.util.Date;

/**
 * Created by George on 10.07.2017.
 */
public class ThreadsABCTest {
    public static void main(String[] args) throws InterruptedException {

        Thread threadsMain = Thread.currentThread();
        ThreadsABC threadsA = new ThreadsABC("\tA");
        ThreadsABC threadsB = new ThreadsABC("\t\tB");
        ThreadsABC threadsC = new ThreadsABC("\t\t\tC");
        Date date = new Date();

            threadsMain.run();
            System.out.println(threadsMain.getState() +" "+ threadsMain.getName());
            threadsA.run();
            threadsA.sleep(10000);
            System.out.println(date.getTime());
            System.out.println(threadsMain.getState() +" "+ threadsMain.getName());
            threadsB.run();
            threadsC.run();

            date.getTime();


    }
}
