package ro.academyplus.avaj.simulator;

public class WeatherProvider {
    private static WeatherProvider instance;
    private String[] weather;

    private WeatherProvider() {}

    public static WeatherProvider getInstance() {
        if (instance == null) {
            instance = new WeatherProvider();
        }
        return instance;
    }

    public String getCurrentWeather(Coordinates p_coordinates) {
        // TODO: implement
        return null;
    }
}
