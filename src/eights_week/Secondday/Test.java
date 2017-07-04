package eights_week.Secondday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by George on 04.07.2017.
 */
public class Test {
    public static void main(String[] args) {

//        int [] arr = {5, 6, 7, 2, 1};
//        Arrays.sort(arr);

//        System.out.println(Arrays.toString(arr));

        ArrayList<User> list = new ArrayList<>();
        list.add(new User("Ivanov",25));
        list.add(new User("Petrov",24));
        list.add(new User("Sidorov",22));
        list.add(new User("Kozlov",23));



        Collections.sort(list);

        System.out.println(list);
    }
}
