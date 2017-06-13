package fifth_week.linkedStack1stGen;

/**
 * Created by George on 12.06.2017.
 */
public class LinkedStack {
    LinkList linkList = new LinkList();
    public void push(int data) {
        linkList.insertFirst(data);
    }

    public void pop() {
        while(!linkList.isEmpty()){
            linkList.deleteFirst();
        }
    }

    public void displayStack() {
        System.out.println("  ");
        linkList.displayList();
    }
}
