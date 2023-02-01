package Dogs;

/**
 * @author Emanuel Zech
 * <p>
 * created on 20.01.2023
 */
public class WuffWuff implements BarkStrategy {

    @Override
    public void Bark(String name) {
        System.out.println("WuffWuff WuffWuff I am " + name);

    }
}
