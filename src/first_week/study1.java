package first_week;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by George on 24.05.2017.
 */
public class study1 {
    public static void main(String[] args) throws IOException {
       /*  int [] arr = {1,2,3,4};      //заполняем массив случайными числами


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);

        }
        System.out.println(Arrays.toString(arr));*/

//        int[] arr = new int[6];
//        foo(8, 5, 5);
//    }
//
//    public static void foo(int a, int b, int c) {
//        System.out.println(c);
//    }

        //indexOf = метод первого вхождения


        //charAt = счиитать символы


//        FileWriter fileWriter = new FileWriter("file.txt"); //если добавить true файл будет дозаписоваться
//        fileWriter.write("Stringa");
//        fileWriter.write("Stringa2");
//        fileWriter.write("Stringa3");
//        fileWriter.write("Stringa4");
//        fileWriter.flush();
//        fileWriter.close();
//
//        FileReader fileReader = new FileReader("file.txt");
//        Scanner scanner =new Scanner(fileReader);
//        System.out.println(scanner.nextLine());

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.remove(0);
        list.add(5);
        System.out.println(list);
    }

}
