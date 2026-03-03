package P4ObjectOriented;

public class Microwave implements Device{
    private int powerLevel;

    public Microwave(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    @Override
    public int getReading() {
        return powerLevel;
    }

    @Override
    public void performAction() {
        System.out.println("Heating food at power level: " + getReading() + ".");
    }

    public String heatFood() {
        return "Heating food at power level: " + getReading() + ".";
    }

}
