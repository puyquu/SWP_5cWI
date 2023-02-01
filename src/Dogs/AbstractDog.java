package Dogs;

/**
 * @author Emanuel Zech
 * <p>
 * created on 20.01.2023
 */
public abstract class AbstractDog implements Dog {
    String name;
    BarkStrategy barkStrategy;
    public AbstractDog(BarkStrategy barkStrategy, String name) {
        this.name = name;
        this.barkStrategy = barkStrategy;
    }
}
