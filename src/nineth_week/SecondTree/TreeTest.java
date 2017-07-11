package nineth_week.SecondTree;

import static nineth_week.SecondTree.Tree.root;

/**
 * Created by George on 11.07.2017.
 */
public class TreeTest {

    public static void main(String arg[]){
        Tree tree = new Tree();
        tree.add(3);
        tree.add(8);
        tree.add(1);
        tree.add(4);
        tree.add(6);
        tree.add(2);
        tree.add(10);
        tree.add(9);
        tree.add(20);
        tree.add(25);
        tree.add(15);
        tree.add(16);
        System.out.println("Original Tree : ");
        tree.display(root);

        System.out.println("");
        System.out.println("Check whether Node with value 4 exists : " + tree.find(4));
        System.out.println("Delete Node with no children (2) : " + tree.delete(2));
        tree.display(root);
        System.out.println("\n Delete Node with one child (4) : " + tree.delete(4));
        tree.display(root);
        System.out.println("\n Delete Node with Two children (10) : " + tree.delete(10));
        tree.display(root);
    }
}

