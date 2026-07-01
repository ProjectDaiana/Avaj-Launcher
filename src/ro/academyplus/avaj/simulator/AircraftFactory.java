package ro.academyplus.avaj.simulator;

public class AircraftFactory {
    private static AircraftFactory instance;

    private AircraftFactory() {}

    public static AircraftFactory getInstance() {
        if (instance == null) {
            instance = new AircraftFactory();
        }
        return instance;
    }

    public Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates) {
        // TODO: implement
        return null;
    }
}
