package observer.examples.auction;

import observer.pattern.Event;
import observer.pattern.Observer;


public class Bidder implements Observer {

    private static int ID = 0;

    @Override
    public void update(Event event) {
        System.out.println(
                "ID: " + (++ID) +
                        ", Updating event type: " +  event.getType() +
                        ", Event description: " + event.getDescription());
    }
}
