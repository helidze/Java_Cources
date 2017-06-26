package seventh_week;

import java.util.NoSuchElementException;

/**
 * Created by George on 26.06.2017.
 */
public class StackWithGenerics <E>{


    private final int size;

    private int top;

    private E[] elements;

    public StackWithGenerics() {
        this(10);
    }

    public StackWithGenerics(int s) {
        size = s > 0 ? s : 10;
        top = -1;

        elements = (E[]) new Object[size]; // create array
    }

    public void push(E pushValue) {
        if (top == size - 1) // if stack is full
            throw new FullStackException(String.format("Stack is full, cannot push %s", pushValue));

        elements[++top] = pushValue; // place pushValue on Stack
    }

    public E pop() {
        if (top == -1) // if stack is empty
            throw new EmptyStackException("Stack is empty, cannot pop");

        return elements[top--]; // remove and return top element of Stack
    }
}

class EmptyStackException extends RuntimeException {
    public EmptyStackException() {
        this("Stack is empty");
    }

    public EmptyStackException(String exception) {
        super(exception);
    }
}

class FullStackException extends RuntimeException {
    public FullStackException() {
        this("Stack is full");
    }

    public FullStackException(String exception) {
        super(exception);
    }
            }

            class MainClass{
                public static void main(String[] args) {
                    StackWithGenerics stackWithGenerics = new StackWithGenerics();
                    stackWithGenerics.push(5);
                    stackWithGenerics.push(1);
                    stackWithGenerics.push(2);
                    stackWithGenerics.push(3);
                    stackWithGenerics.push(4);
                    stackWithGenerics.push(6);
                    stackWithGenerics.push(7);
                    stackWithGenerics.push(8);
                    stackWithGenerics.push(9);
                    stackWithGenerics.push(10);

                    System.out.println(stackWithGenerics.pop());
                }

        }