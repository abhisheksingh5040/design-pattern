package behavioral.observer.youtube;

public interface Subject {

    void subscriber(Observer observer);

    void unSubscriber(Observer observer);

    void notifyUser();
}
