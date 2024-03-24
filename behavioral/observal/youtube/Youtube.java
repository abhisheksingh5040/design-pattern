package behavioral.observal.youtube;

import java.util.ArrayList;
import java.util.List;

public class Youtube implements Subject{

    private List<Observer> subscribers = new ArrayList<>();
    private String content;
    @Override
    public void subscriber(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyUser() {
        for(Observer subscriber : subscribers){
            subscriber.updateForAVideos(content);
        }
    }

    public void addVideos(String content){
        this.content = content;
        notifyUser();
    }
}
