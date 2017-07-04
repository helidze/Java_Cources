package eights_week.Secondday;

import java.util.*;

/**
 * Created by George on 04.07.2017.
 */
public class Iterator {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);

        System.out.println(linkedList);

        java.util.Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            int a = iterator.next();
            if (a == 6) iterator.remove();
            else System.out.println(a + " " );
        }


    }
}

