package fifth_week.linkedStack2ndGen;

/**
 * Created by George on 12.06.2017.
 */
public interface Stack <Item>
{
    Item pop(); // return the top item and removes it from stack
    void push(Item item); // adds an item to the stack
    boolean isEmpty(); // returns true if stack is empty, false otherwise
    int size();  // returns the number of items in stack right now
}
