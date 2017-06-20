package sixth_week;

/**
 * Created by George on 19.06.2017.
 */
public class RecursiveFibonnachi {
    public static void main(String[] args) {
        System.out.println(5);
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
            if ((n == 1) || (n == -1)) {
                return 1;
            } else {
                if (n > 0) {
                    return fib(n - 1) + fib(n - 2);
                }

            }
        return n;
    }
    }
