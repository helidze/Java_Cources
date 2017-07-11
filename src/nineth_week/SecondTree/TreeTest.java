package nineth_week.SecondTree;

/**
 * Created by George on 11.07.2017.
 */
public class TreeTest {

    public static void main(String arg[]){
        Tree tree = new Tree();
        tree.add(3);tree.add(8);
        tree.add(1);tree.add(4);tree.add(6);tree.add(2);tree.add(10);tree.add(9);
        tree.add(20);tree.add(25);tree.add(15);tree.add(16);
        System.out.println("Original Tree : ");
        tree.display(tree.root);
    }
}

