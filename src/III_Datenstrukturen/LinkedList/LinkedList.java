package III_Datenstrukturen.LinkedList;

import III_Datenstrukturen.HTLList;
import III_Datenstrukturen.Node;

/**
 * @author Emanuel Zech
 * <p>
 * created on 10.11.2022
 */
public class LinkedList implements HTLList {

    private Node root;

    @Override
    public void add(int value) {
        Node n = new Node(value);
        if (root == null) {
            root = n;
        } else {
            Node actual = root;
            while (actual.getNext() != null) {
                actual = actual.getNext();
            }
            actual.setNext(n);
        }
    }

    @Override
    public int get(int index) {
        Node actual = root;
        int counter = 0;
        while (actual.getNext() != null) {
            if (counter == index) {
                return actual.getValue();
            } else {
                counter++;
                actual = actual.getNext();
            }

        }
        return -1;
    }

    @Override
    public void remove(int index) {
        Node actual = root;
        int counter = 0;
        while (actual.getNext() != null) {
            if (counter == index) {
                while (actual.getNext() != null) {
                    actual.setValue(actual.getNext().getValue());
                    actual = actual.getNext();
                }
            } else {
                counter++;
                actual = actual.getNext();
            }
        }
    }
}
