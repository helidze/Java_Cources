package fourth_week.Collections;

/**
 * Created by George on 06.06.2017.
 */
public class ArrayStack implements Stack {

        private int top;
        private int[] storage;

        ArrayStack(int capacity) {
            if (capacity <= 0)
                throw new IllegalArgumentException(
                        "Stack's capacity must be positive");
            storage = new int[capacity];
            top = -1;
        }

        public Integer push(int value) {
            if (top == storage.length)
                throw new StackException("Stack's underlying storage is overflow");
            top++;
            storage[top] = value;
            return null;
        }

    @Override
    public boolean empty() {
        return false;
    }

    public int peek() {
            if (top == -1)
                throw new StackException("Stack is empty");
            return storage[top];
        }

        public void pop() {
            if (top == -1)
                throw new StackException("Stack is empty");
            top--;
        }

    @Override
    public Integer pick() {
        return null;
    }

    @Override
    public void size() {

    }

        public class StackException extends RuntimeException {
            public StackException(String message) {
                super(message);
            }
        }
    }