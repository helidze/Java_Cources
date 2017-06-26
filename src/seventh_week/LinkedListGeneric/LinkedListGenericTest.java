package seventh_week.LinkedListGeneric;

/**
 * Created by George on 26.06.2017.
 */
public class LinkedListGenericTest {
    public static void main(String[] args) {
        LinkedListGeneric<String> list = new LinkedListGeneric<String>();
        list.insert(new LinkedListNode<String>("1a"));
        list.insert(new LinkedListNode<String>("2b"));
        list.insert(new LinkedListNode<String>("3c"));
        list.insert(new LinkedListNode<String>("4d"));
        list.print();
        list.remove();
        System.out.println("After removing the head..");
        list.print();
    }

}
