package ro.academyplus.avaj.simulator;

public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;

    Coordinates(int p_longitude, int p_latitude, int p_height){
        if (p_longitude < 0 || p_latitude < 0 || p_height < 0)
            throw new IllegalArgumentException("Coordinates cannot be negative.");
        this.longitude = p_longitude;
        this.latitude = p_latitude;
        this.height = Math.min(p_height, 100);
    }
    public int getLongitude() {
        return longitude;
    }
    public int getLatitude() {
        return latitude;
    }
    public int getHeight() {
        return height;
    }
}
