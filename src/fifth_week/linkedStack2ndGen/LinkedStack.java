package fifth_week.linkedStack2ndGen;

import java.util.Iterator;

/**
 * Created by George on 12.06.2017.
 */
public class LinkedStack<Item> implements Stack<Item>{

    private Node head; //the first node
    private int size; // number of items

    //Nested class to define node
    private class Node
    {
        Item item;
        Node next;
    }

    //Zero argument constructor
    public LinkedStack()
    {
        head = null;
        size = 0;
    }

    //Check if stack is empty
    public boolean isEmpty()
    {
        return (size == 0);
    }

    //Remove item from the beginning of the list.
    public Item pop()
    {
        Item item = head.item;
        head = head.next;
        size--;
        return item;
    }

    //Add item to the beginning of the list.
    public void push(Item item)
    {
        Node oldHead = head;
        head = new Node();
        head.item = item;
        head.next = oldHead;
        size++;
    }

    //Return number of items present in the stack
    public int size()
    {
        return size;
    }

    //Iterator for traversing stack items
    public Iterator<Item> iterator()
    {
        return new LinkedStackIterator();
    }

    //inner class to implement iterator interface
    private class LinkedStackIterator implements Iterator <Item>
    {
        private int i = size;
        private Node first = head; //the first node

        public boolean hasNext()
        {
            return (i > 0);
        }

        public Item next()
        {
            Item item = first.item;
            first = first.next;
            i--;
            return item;
        }

        public void remove()
        {
            // not needed
        }
    }
}
