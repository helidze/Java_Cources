package sixth_week;

/**
 * Created by George on 19.06.2017.
 */
public class Recursive {
    public static void main(String[] args) {
        a(0); //переменная i
    }
    public static void a(int i){
        if (i==10) return;
//        System.out.println(i); // от 0-10
        a(++i);
        System.out.println(i); // от 10-0
    }
}
