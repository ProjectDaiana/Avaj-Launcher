package ro.academyplus.avaj.simulator;

public class AircraftFactory {
    private static AircraftFactory instance;
    private long nextId = 1;
 
    private AircraftFactory() {}

    public static AircraftFactory getInstance() {
        if (instance == null) {
            instance = new AircraftFactory();
        }
        return instance;
    }

    public Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates) {
        long id = nextId++;    
        return switch (p_type) {
            case "Helicopter" -> new Helicopter(id, p_name, p_coordinates);
            case "JetPlane" -> new JetPlane(id, p_name, p_coordinates);
            case "Balloon" -> new Balloon(id, p_name, p_coordinates);
            default -> throw new IllegalArgumentException("Unknown type: " + p_type);
        };
    }
}
