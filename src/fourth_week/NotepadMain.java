package fourth_week;

import java.util.GregorianCalendar;

/**
 * Created by George on 06.06.2017.
 */
public class NotepadMain extends Notepad {
    public static void main(String[] args) {

        Notepad.NestedNotepad nestedNotepad = new Notepad.NestedNotepad();
        nestedNotepad.addToCalendar();
    }
}
