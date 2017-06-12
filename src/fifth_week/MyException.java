package fifth_week;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by George on 12.06.2017.
 */
public class MyException extends Exception {



    public MyException() throws FileNotFoundException {}

    public MyException(String message) throws FileNotFoundException {
        super(message);
    }


    FileReader fileReader = new FileReader("file");
    Scanner scanner = new Scanner(fileReader);


}
