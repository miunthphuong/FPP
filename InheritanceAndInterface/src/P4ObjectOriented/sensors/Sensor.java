package P4ObjectOriented.sensors;

public interface Sensor {
    String getSensorType();
    double getReading();
    String getLocation();

    String getLastUpdated();
    String performAction();
}
