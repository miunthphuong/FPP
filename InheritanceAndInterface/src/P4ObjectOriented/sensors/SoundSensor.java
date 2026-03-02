package P4ObjectOriented.sensors;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor {
    String lastupdated;
    int soundLevel;
    String location;

    public SoundSensor(int soundLevel, String location) {
        this.soundLevel = soundLevel;
        this.location = location;
    }


    @Override
    public String getSensorType() {
        return "Sound Sensor";
    }

    @Override
    public double getReading() {
        return soundLevel;
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
        if (soundLevel>70)
            return "turn on noise cancellation";
        else
            return "Sound is within normal range";
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
