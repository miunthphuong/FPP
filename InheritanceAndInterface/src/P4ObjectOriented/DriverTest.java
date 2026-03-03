package P4ObjectOriented;

public class DriverTest {
    public static void main(String[] args) {
        Device[] arr = {
                new WashingMachine(7),
                new Refrigerator(4),
                new Microwave(800)
        };
        for (Device item : arr) {
            System.out.println(item.getClass().getSimpleName());
            item.performAction();
        }
    }
}