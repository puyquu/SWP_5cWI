package ObserverPattern;

/**
 * @author Emanuel Zech
 * <p>
 * created on 26.01.2023
 */
public class Heater implements Observer {

    @Override
    public void inform() {
        System.out.println("Startet heating");
    }
}
