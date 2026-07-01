package ro.academyplus.avaj.simulator;

public class JetPlane extends Aircraft {
    public JetPlane(long p_id, String p_name, Coordinates p_coordinate) {
        super(p_id, p_name, p_coordinate);
        System.out.println("JetPlane#" + p_name + "(" + p_id + "): registered to weather tower.");
    }

    @Override protected String getType() { return "JetPlane"; }

    // increments: {longitude, latitude, height}
    @Override protected int[] onSun()  { return new int[]{ 0, 10,  2}; }
    @Override protected int[] onRain() { return new int[]{ 0,  5,  0}; }
    @Override protected int[] onFog()  { return new int[]{ 0,  1,  0}; }
    @Override protected int[] onSnow() { return new int[]{ 0,  0, -7}; }
}
