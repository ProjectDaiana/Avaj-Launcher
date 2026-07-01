package ro.academyplus.avaj.simulator;

public class Balloon extends Aircraft {
    public Balloon(long p_id, String p_name, Coordinates p_coordinate) {
        super(p_id, p_name, p_coordinate);
        System.out.println("Balloon#" + p_name + "(" + p_id + "): registered to weather tower.");
    }

    @Override protected String getType() { return "Balloon"; }

    // increments: {longitude, latitude, height}
    @Override protected int[] onSun()  { return new int[]{ 2, 0,  4}; }
    @Override protected int[] onRain() { return new int[]{ 0, 0, -5}; }
    @Override protected int[] onFog()  { return new int[]{ 0, 0, -3}; }
    @Override protected int[] onSnow() { return new int[]{ 0, 0,  0}; }
}
