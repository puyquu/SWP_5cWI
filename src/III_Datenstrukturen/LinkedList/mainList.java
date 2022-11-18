package III_Datenstrukturen.LinkedList;

/**
 * @author Emanuel Zech
 * <p>
 * created on 10.11.2022
 */
public class mainList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.remove(0);
        System.out.println(ll.get(0));
    }
}
