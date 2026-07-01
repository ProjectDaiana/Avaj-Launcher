package ro.academyplus.avaj.simulator;

public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;

    Coordinates(int p_longitude, int p_latitude, int p_height){
        if (p_longitude || p_latitude || p_height < 0 )
    }
    public int getLongitude();
    public int getLatitude();
    public int getHeight();
}
