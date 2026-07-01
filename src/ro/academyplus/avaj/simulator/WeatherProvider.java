package ro.academyplus.avaj.simulator;

public class WeatherProvider {
    public static final String SUN  = "SUN";
    public static final String RAIN = "RAIN";
    public static final String FOG  = "FOG";
    public static final String SNOW = "SNOW";

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
