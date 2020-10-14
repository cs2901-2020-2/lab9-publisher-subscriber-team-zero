package lab9;

class MessageBroker {
    HashMap<String, List<Subscriber>> subscriberMap;
    HashMap<String, List<String>> messageMap;

    public MessageBroker(){
        subscriberMap = new HashMap<String, List<Subscriber>>();
        messageMap = new HashMap<String, List<String>>();
    }

    public void registerSubscriber(Subscriber s, String channel){
        var subscriberList = subscriberMap.get(channel);
        if (subscriberList != null){
            subscriberList.add(s);
        }
        else{
            subscriberList = new ArrayList<String>();
            subscriberList.add(s);
            subscriberMap.put(channel, subscriberList);
        }
    }

    public void removeSubscriber(Subscriber s, String channel){
        var subscriberList = subscriberMap.get(channel);
        subscriberList.remove(s);
    }

    public void notifySubscribers(String channel){
        var subscriberList = subscriberMap.get(channel);
        for (Subscriber s : subscriberList){
            s.notify();
        }
    }
}