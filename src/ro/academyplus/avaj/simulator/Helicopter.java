package ro.academyplus.avaj.simulator;

public class Helicopter extends Aircraft  {
    public Helicopter(long p_id, String p_name, Coordinates p_coordinate) {
        //TYPE#NAME(UNIQUE_ID): SPECIFIC_MESSAGE.
        system
    }
    public void updateConditions() {
        String weather = getWeather(p_coordinate) {
            case weather = SUN {
                lon_increment += 10;
                h_increment += 2;
            }
            case weather = RAIN {
                lon_increment += 5;
            }
            case weahter = FOG {
                lon_increment += 1;
            }
            case weather = SNOW {
                h_increment -= 12;
            }

        }
        this.coordinates = Coordinates(this.p_longitude + lon_increment, this.p_latitude + lat_increment , this.p_height + h_increment)
    }
}
