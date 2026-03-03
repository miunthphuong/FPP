package P4ObjectOriented;

public class WashingMachine implements Device{
    private int loadCapacity;

    public WashingMachine(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public int getReading() {
        return loadCapacity;
    }

    @Override
    public void performAction() {
        System.out.println("Starting wash cycle with load capacity: " + getReading() + " kg.");
    }
}
