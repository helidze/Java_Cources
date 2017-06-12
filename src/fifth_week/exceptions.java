package fifth_week;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by George on 12.06.2017.
 */
public class exceptions {
    public static void main(String[] args) throws Exception {
        int a=4, b=0;

        try {
            FileReader fileReader = new FileReader("1");
            System.out.println(a/b);
        }
        catch (ArithmeticException | IOException e){
            System.err.println(e.getMessage());
            System.err.println(e.getStackTrace());
            System.out.println(a*a);
        }

    }
}
