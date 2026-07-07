package ro.academyplus.avaj.simulator;

public class JetPlane extends Aircraft {
    public JetPlane(long p_id, String p_name, Coordinates p_coordinate) {
        super(p_id, p_name, p_coordinate);
    }

    @Override protected String getType() { return "JetPlane"; }

    // increments: {longitude, latitude, height}
    @Override protected int[] onSun()  { return new int[]{ 0, 10,  2}; }
    @Override protected int[] onRain() { return new int[]{ 0,  5,  0}; }
    @Override protected int[] onFog()  { return new int[]{ 0,  1,  0}; }
    @Override protected int[] onSnow() { return new int[]{ 0,  0, -7}; }

    @Override protected String onSunMessage()  { return "Clear skies, full throttle!"; }
    @Override protected String onRainMessage() { return "It's raining. Better watch out for lightings."; }
    @Override protected String onFogMessage()  { return "Flying blind out here!"; }
    @Override protected String onSnowMessage() { return "OMG! Winter is coming!"; }
}
