package fifth_week.linkedStack2ndGen;

/**
 * Created by George on 12.06.2017.
 */
public class LinkedStackTest {
    public static void main(String[] args) {
       // Stack<Integer> linkedStack = new LinkedStack<Integer>();
        //LinkedStack linkedStack = new LinkedStack();
        LinkedStack s = new LinkedStack();
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);

        System.out.println("Size of the stack: " + s.size());

        // iterate through stack
        System.out.println("Stack contains following items till this moment:");
        System.out.println(s.toString().chars());
    }

    }




