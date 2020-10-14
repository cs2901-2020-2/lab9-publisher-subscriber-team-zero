package lab9;

public class Publisher(){
    public void publish(Object data, String channel){
        List<Suscriber> listSubs = map.get(channel);
        for (Suscriber sub : listSubs){
            sub.notify();
        }
    }
}