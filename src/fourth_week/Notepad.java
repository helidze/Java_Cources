package fourth_week;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by George on 06.06.2017.
 */
public class Notepad {

    public static class NestedNotepad {
        ArrayList<Date> arrayList = new ArrayList();
        GregorianCalendar cal =
                (GregorianCalendar) GregorianCalendar.getInstance();

        public void addToCalendar() {
            int a = 0;
            for (int i = 0; i < 3; i++) {
                arrayList.add(cal.getTime());

            }
            System.out.println(arrayList.get(0) + " " + "new row" +" " + a++);
            System.out.println(arrayList.get(1) + " " + "new row" +" " + a++);
            System.out.println(arrayList.get(2) + " " + "new row" +" " + a++);

        }
    }


}
