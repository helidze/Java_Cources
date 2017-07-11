package sixth_week.List_ArrayList;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by George on 20.06.2017.
 */
public class javaList {
    public ListNode head;
    public int listCount;

    public javaList() {
        head = new ListNode(0);
        listCount = 0;
    }

    public void show() {
        ListNode current = head;
        while (current.next != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println(current.data);
    }

    public boolean add(int d) {
        ListNode end = new ListNode(d);
        ListNode current = head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = end;
        listCount++;
        System.out.println(d + " Добавлено в хвост!");
        return true;
    }

    public boolean add(int index,int d) {
        ListNode end = new ListNode(d);
        ListNode current = head;
        int jump;

        if (index > listCount || index < 1) {
            System.out.println("Добавление завершилось ошибкой: индекс out of bounds раземера linked list!!");
            return false;
        } else {
            jump = 0;
            while (jump < index - 1) {
                current = current.next;
                jump++;
            }
            end.next = current.next;
            current.next = end;
            listCount++;
            System.out.println("Удачно! " + d + " добавлено в индекс " + index);
            return true;
        }
    }

    public boolean deleteNodeWithData(int d) {
        ListNode current = head;
        while (current.next != null) {
            if (current.next.data == d) {
                current.next = current.next.next;
                listCount--;
                System.out.println("Удачно! MyTreeNode с данными " + d + " удалена.");
                return true;
            }
            current = current.next;
        }
        System.out.println("Удаление завершилоь ошибкой: Не найден node для предоставленых значений!");
        return false;
    }

    public boolean deleteNodeAtIndex(int index) {
        ListNode current = head;
        int jump;
        if (index > listCount || index < 1) {
            System.out.println("Удаление завершилось ошибкой: индекс out of bounds раземера linked list!!");
            return false;
        } else {
            jump = 0;
            while (jump < index - 1) {
                current = current.next;
                jump++;
            }
            current.next = current.next.next;
            System.out.println("Успешно! MyTreeNode с индексом " + index + " удален.");
            listCount--;
            return true;
        }
    }


    public static void main(String[] args) {

        javaList javaList = new javaList();
        javaList.add(6);
        javaList.show();
        javaList.add(5);

        javaList.show();
        javaList.add(1,2);
        javaList.show();
        javaList.deleteNodeAtIndex(2);
        javaList.show();
        javaList.deleteNodeWithData(5);
        javaList.show();
        LinkedList linkedList = new LinkedList();
        linkedList.indexOf(linkedList);
    }
}