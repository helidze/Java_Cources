package nineth_week;

/**
 * Created by George on 10.07.2017.
 */
public class ThreadsABC extends Thread{
   String nameOfThread;

   public ThreadsABC(String nameOfThread){
       this.nameOfThread = nameOfThread;
   }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            if(!Thread.interrupted()){
            System.out.println(nameOfThread + " " + i +" "+ getState());}
            else {
                return;
            }
        }
    }
}
