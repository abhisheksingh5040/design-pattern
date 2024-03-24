package behavioral.observal.weatherstation;

public class Main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer tvDisplay = new TvDisplay();
        Observer phoneDisplay = new PhoneDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        weatherStation.setWeather("Sunny");
    }
}
