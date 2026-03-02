package P4ObjectOriented;

import P4ObjectOriented.sensors.LightSensor;
import P4ObjectOriented.sensors.Sensor;
import P4ObjectOriented.sensors.SoundSensor;
import P4ObjectOriented.sensors.TemparatureSensor;

public class sensorTest {
    static void main() {
        Sensor[] sensors =new Sensor[]{
                new LightSensor(100,"Kitchen"),
                new SoundSensor(25,"Garden"),
                new TemparatureSensor(31,"Bedroom"),
                new LightSensor(99,"Kitchen"),
                new SoundSensor(71,"Garden"),
                new TemparatureSensor(19,"Bedroom"),
        };


        for (int i = 0; i < sensors.length; i++)
            IO.println(sensors[i].toString());

    }
}
