package sixth_week;

/**
 * Created by George on 19.06.2017.
 */
public class RecursivePow {
    public static void main(String[] args) {
       System.out.println(pow(11,2));
    }
    public static long pow(int a, int b){
        if(b!=1){ return a*pow(a,b-1);}
        else {
            return a;
        }

    }
}
