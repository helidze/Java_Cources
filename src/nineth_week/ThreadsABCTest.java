package nineth_week;

/**
 * Created by George on 10.07.2017.
 */
public class ThreadsABCTest {
    public static void main(String[] args) {

        Thread threadsMain = Thread.currentThread();
        ThreadsABC threadsA = new ThreadsABC("\tA");
        ThreadsABC threadsB = new ThreadsABC("\t\tB");
        ThreadsABC threadsC = new ThreadsABC("\t\t\tC");





            threadsMain.run();
            System.out.println(threadsMain.getState() +" "+ threadsMain.getName());
            threadsA.run();
            System.out.println(threadsMain.getState() +" "+ threadsMain.getName());
            threadsB.run();
            threadsC.run();




    }
}
