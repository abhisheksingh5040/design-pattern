package behavioral.observal.youtube;

public class Main {

    public static void main(String[] args) {
        Youtube youtube = new Youtube();

        Observer mobilePhone1  = new MobilePhone();
        Observer mobilePhone2  = new MobilePhone();
        Observer mobilePhone3  = new MobilePhone();
        Observer mobilePhone4  = new MobilePhone();

        youtube.subscriber(mobilePhone1);
        youtube.subscriber(mobilePhone2);
        youtube.subscriber(mobilePhone3);
        youtube.subscriber(mobilePhone4);

        youtube.addVideos("Dhoni!!!!");
        youtube.unSubscriber(mobilePhone4);
        youtube.addVideos("KBC");

    }
}
