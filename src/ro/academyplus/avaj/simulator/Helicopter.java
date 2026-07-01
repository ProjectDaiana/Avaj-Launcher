package ro.academyplus.avaj.simulator;

public class Helicopter extends Aircraft {
    public Helicopter(long p_id, String p_name, Coordinates p_coordinate) {
        super(p_id, p_name, p_coordinate);
        System.out.println("Helicopter#" + p_name + "(" + p_id + "): registered to weather tower.");
    }

    @Override protected String getType() { return "Helicopter"; }

    // increments: {longitude, latitude, height}
    @Override protected int[] onSun()  { return new int[]{ 10, 0,   2}; }
    @Override protected int[] onRain() { return new int[]{  5, 0,   0}; }
    @Override protected int[] onFog()  { return new int[]{  1, 0,   0}; }
    @Override protected int[] onSnow() { return new int[]{  0, 0, -12}; }
}
