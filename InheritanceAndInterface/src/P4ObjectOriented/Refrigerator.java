package P4ObjectOriented;

public class Refrigerator implements Device {
    private int temperature;

    public Refrigerator(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public int getReading() {
        return temperature;
    }

    @Override
    public void performAction() {
        System.out.println("Cooling items at temperature: " + getReading() + "°C.");
    }

}
