package eights_week.Secondday;

import java.util.Collections;

/**
 * Created by George on 04.07.2017.
 */
public class OwnIteratorTest {
    public static void main(String[] args) {
        // create an array of type Integer
        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5};

        // create your list and hold the values.
        OwnIteratorList<Integer> ownIteratorList = new OwnIteratorList<Integer>(numbers);

        // Since our class OwnIteratorList is an instance of Iterable, then we can use it on a foreach loop
        for(Integer num : ownIteratorList) {
            System.out.print(num);
        }

        // creating an array of Strings
        String[] languages = new String[]{"C", "C++", "Java", "Python", "Scala"};

        // create your list and hold the values using the same list implementation.
        OwnIteratorList<String> languagesList = new OwnIteratorList<String>(languages);


        System.out.println("");
        // Since our class OwnIteratorList is an instance of Iterable, then we can use it on a foreach loop
        for(String lang : languagesList) {
            System.out.println(lang);

        }

    }
}
