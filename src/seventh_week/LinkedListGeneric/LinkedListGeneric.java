package seventh_week.LinkedListGeneric;

/**
 * Created by George on 26.06.2017.
 */
public class LinkedListGeneric<T> {
    private LinkedListNode<T> first = null;


    public void insert(LinkedListNode<T> node) {
        node.setNext(first);
        first = node;
    }


    public void remove() {
        if (first.getNext() != null)
            first = first.getNext();
        else first = null;
    }


    private void printList(LinkedListNode<T> node) {
        System.out.println("Node is " + node.getValue());
        if (node.getNext() != null) printList(node.getNext());
    }

    public void print() {
        printList(first);
    }
}
