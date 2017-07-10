package nineth_week;

/**
 * Created by George on 10.07.2017.
 */
public class Thread2 implements Runnable {
    private String name;

    public Thread2(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println(name + " " + i);
        }
    }
}
