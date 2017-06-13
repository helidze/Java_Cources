package fifth_week.linkedStack1stGen;

/**
 * Created by George on 12.06.2017.
 */
public class LinkedStackTest {
    public static void main(String[] args) {
        LinkedStack linkedStack = new LinkedStack();

        linkedStack.push(50);
        linkedStack.push(25);
        linkedStack.push(35);
        linkedStack.push(35);
        linkedStack.push(25);
        linkedStack.displayStack();
        linkedStack.pop();
        linkedStack.displayStack();
    }
}
