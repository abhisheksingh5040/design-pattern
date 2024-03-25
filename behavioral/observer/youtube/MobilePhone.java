package behavioral.observer.youtube;

public class MobilePhone implements Observer{
    @Override
    public void updateForAVideos(String videos) {
        System.out.println(videos + " is streaming!!!");
    }
}
