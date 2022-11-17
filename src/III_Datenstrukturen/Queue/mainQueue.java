package III_Datenstrukturen.Queue;

/**
 * @author Emanuel Zech
 * <p>
 * created on 17.11.2022
 */
public class mainQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

    }
}
