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

    protected abstract String getType();
    protected abstract int[] onSun();
    protected abstract int[] onRain();
    protected abstract int[] onFog();
    protected abstract int[] onSnow();

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
            weatherTower.unregister(this);
            System.out.println(getType() + "#" + name + "(" + id + "): landing.");
            return;
        }

        this.coordinates = new Coordinates(
            this.coordinates.getLongitude() + inc[0],
            this.coordinates.getLatitude()  + inc[1],
            newHeight
        );
        System.out.println(getType() + "#" + name + "(" + id + "): " + weather + ".");
    }
}
