package Dogs;

/**
 * @author Emanuel Zech
 * <p>
 * created on 20.01.2023
 */
public class Puddel extends AbstractDog{


    public Puddel(BarkStrategy barkStrategy, String name) {
        super(barkStrategy, name);
    }

    @Override
    public void run() {
        this.barkStrategy.Bark(this.name);
    }
}
