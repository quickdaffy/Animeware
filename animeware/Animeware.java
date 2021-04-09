package animeware;

import animeware.event.EventManager;
import animeware.util.SessionChanger;
import org.omg.CosNaming.BindingIterator;

public class Animeware {

    public static Animeware INSTANCE = new Animeware();
    public String NAME = "Animeware", VERSION = "1", NAMEVER = NAME + " " + VERSION;

    public EventManager eventManager;

    public void init() {
        eventManager = new EventManager();
        System.out.println("Starting " + NAMEVER);
        SessionChanger.getInstance().setUserOffline("sexface69");

        eventManager.register(this);
    }

    public void shuwdown() {
        System.out.println("Stopping " + NAMEVER);

        eventManager.unregister(this);
    }
}
