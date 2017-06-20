package sixth_week;

import static sixth_week.RecursiveFactorial.factorial;

/**
 * Created by George on 20.06.2017.
 */
public class RecursiveFactorial {
    public static void main(String[] args) {
        System.out.println(5);
    }
    public static int factorial(int x){
        if (x == 1){
            return 1;
        }
        else {
            return x*factorial(x-1);
        }
    }
}
