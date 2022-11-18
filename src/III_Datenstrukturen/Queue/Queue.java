package III_Datenstrukturen.Queue;

import III_Datenstrukturen.HTLQueue;
import III_Datenstrukturen.Node;

/**
 * @author Emanuel Zech
 * <p>
 * created on 17.11.2022
 */
public class Queue implements HTLQueue {
    int length = 0;
    Node first;

    @Override
    public void enqueue(int value) {
        Node temp = new Node(value);
        if(first == null){
            first = temp;
        }else{
            Node actual = first;
            while(actual.getNext() != null) {
                actual = actual.getNext();
            }
            actual.setNext(temp);
        }
    }

    @Override
    public int dequeue() {
        if(first==null){
            System.out.println("----------------------");
            System.out.println("No Value");
            System.out.println("----------------------");
            return -1;
        }
        int result = first.getValue();
        first = first.getNext();
        return result;
    }
}
