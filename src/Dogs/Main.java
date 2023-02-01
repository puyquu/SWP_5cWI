package Dogs;

/**
 * @author Emanuel Zech
 * <p>
 * created on 20.01.2023
 */
public class Main {

    public static void main(String[] args) {
        WuffWuff w1 = new WuffWuff();
        Puddel p1 = new Puddel(w1, "deniz");
        p1.run();

    }
}
