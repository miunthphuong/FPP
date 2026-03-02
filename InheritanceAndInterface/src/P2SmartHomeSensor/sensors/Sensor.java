package P2SmartHomeSensor.sensors;

public interface Sensor {
    String getSensorType();
    double getReading();
    String getLocation();

    String getLastUpdated();
    String performAction();
}
