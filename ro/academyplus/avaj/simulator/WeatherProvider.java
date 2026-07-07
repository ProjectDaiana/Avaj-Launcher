package ro.academyplus.avaj.simulator;

public class WeatherProvider {
    public static final String SUN  = "SUN";
    public static final String RAIN = "RAIN";
    public static final String FOG  = "FOG";
    public static final String SNOW = "SNOW";

    private static final String[] weather = { RAIN, FOG, SUN, SNOW };
    private static WeatherProvider instance;

    private WeatherProvider() {}

    public static WeatherProvider getInstance() {
        if (instance == null) {
            instance = new WeatherProvider();
        }
        return instance;
    }

    public String getCurrentWeather(Coordinates p_coordinates) {
        int index = (p_coordinates.getLongitude() + p_coordinates.getLatitude() + p_coordinates.getHeight()) % 4;
        return weather[index];
    }
}
