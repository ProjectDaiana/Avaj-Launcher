package ro.academyplus.avaj.simulator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

class Simulator {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: Simulator <scenario-file>");
            return;
        }

        try (
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            PrintStream out = new PrintStream("simulation.txt")
        ) {
            System.setOut(out);

            int cycles = Integer.parseInt(reader.readLine().trim());

            WeatherTower weatherTower = new WeatherTower();

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;
                String[] parts = line.split("\\s+");
                String type = parts[0];
                String name = parts[1];
                Coordinates coordinates = new Coordinates(
                    Integer.parseInt(parts[2]),
                    Integer.parseInt(parts[3]),
                    Integer.parseInt(parts[4])
                );
                Flyable flyable = AircraftFactory.getInstance().newAircraft(type, name, coordinates);
                flyable.registerTower(weatherTower);
            }

            for (int i = 0; i < cycles; i++) {
                weatherTower.changeWeather();
            }
        } catch (IOException e) {
            System.out.println("Error reading scenario file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number in scenario file: " + e.getMessage());
        }
    }
}
