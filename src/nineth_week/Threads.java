package nineth_week;

/**
 * Created by George on 10.07.2017.
 */

//through extends from Thread
public class Threads extends Thread{
    private String name;

    public Threads(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println(name + " " + i + getPriority() );
        }
    }
}
