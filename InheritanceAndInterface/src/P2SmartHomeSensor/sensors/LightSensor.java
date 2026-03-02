package P2SmartHomeSensor.sensors;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor {
    String lastupdated;
    int lightLevel;
    String location;

    public LightSensor(int lightLevel, String location) {
        this.lightLevel = lightLevel;
        this.location = location;
    }



    @Override
    public String getSensorType() {
        return "Light Sensor";
    }

    @Override
    public double getReading() {
        return lightLevel;
    }

    @Override
    public String getLocation() {
        return location;
    }


    @Override
    public String getLastUpdated() {
        lastupdated = LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm a"));
        return lastupdated;
    }

    @Override
    public String performAction() {
        if (lightLevel<100)
            return "turn on the light";
        else
            return "Light is sufficient";
    }

    @Override
    public String toString() {
        return "Sensor Type: " + getSensorType() +
                "\nReading: " + getReading() +
                "\nlocation: " + getLocation() +
                "\nLast Updated: " + getLastUpdated() +
                "\nAction: " + performAction() + "\n";
    }
}
