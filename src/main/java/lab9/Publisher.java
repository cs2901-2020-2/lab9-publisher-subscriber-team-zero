package lab9;

import java.util.*;

public class Publisher {
    public void publish(Object data, String channel, HashMap<String, List<Subscriber>> subscriberMap){
        List<Subscriber> listSubs = subscriberMap.get(channel);
        for (Subscriber sub : listSubs){
            sub.notify();
        }
    }
}
