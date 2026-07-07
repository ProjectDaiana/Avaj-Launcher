package ro.academyplus.avaj.simulator;

public abstract class Aircraft extends Flyable {
    protected long id;
    protected String name;
    protected Coordinates coordinates;

    protected Aircraft(long p_id, String p_name, Coordinates p_coordinate) {
        this.id = p_id;
        this.name = p_name;
        this.coordinates = p_coordinate;
    }

    @Override
    public String toString() {
        return getType() + "#" + name + "(" + id + ")";
    }

    protected abstract String getType();
    protected abstract int[] onSun();
    protected abstract int[] onRain();
    protected abstract int[] onFog();
    protected abstract int[] onSnow();
    protected abstract String onSunMessage();
    protected abstract String onRainMessage();
    protected abstract String onFogMessage();
    protected abstract String onSnowMessage();

    @Override
    public final void updateConditions() {
        String weather = weatherTower.getWeather(this.coordinates);
        int[] inc = switch (weather) {
            case WeatherProvider.SUN  -> onSun();
            case WeatherProvider.RAIN -> onRain();
            case WeatherProvider.FOG  -> onFog();
            case WeatherProvider.SNOW -> onSnow();
            default -> new int[]{0, 0, 0};
        };

        int newHeight = this.coordinates.getHeight() + inc[2];
        if (newHeight <= 0) {
            System.out.println(this + " landing.");
            weatherTower.unregister(this);
            return;
        }

        this.coordinates = new Coordinates(
            this.coordinates.getLongitude() + inc[0],
            this.coordinates.getLatitude()  + inc[1],
            newHeight
        );

        String message = switch (weather) {
            case WeatherProvider.SUN  -> onSunMessage();
            case WeatherProvider.RAIN -> onRainMessage();
            case WeatherProvider.FOG  -> onFogMessage();
            case WeatherProvider.SNOW -> onSnowMessage();
            default -> "...";
        };
        System.out.println(this + ": " + message);
    }
}
