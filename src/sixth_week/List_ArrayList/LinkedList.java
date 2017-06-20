package sixth_week.List_ArrayList;

import java.util.List;

/**
 * Created by George on 20.06.2017.
 */
public interface LinkedList {
    void add(Integer elem);
    void add(int indx, Integer elem);

    Integer get(int idnx);
    Integer set(int indx);
    Integer remove(int indx);

    List sublist(int indxForm, int indxTo);

    boolean isEmpty();
    int size();
    int indexOf(Integer elem);
    void clear();
}
