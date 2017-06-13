package fifth_week.linkedStack1stGen;

/**
 * Created by George on 12.06.2017.
 */
public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    public void displayNode() {
        System.out.print(data);
        System.out.print("  ");

    }
}
