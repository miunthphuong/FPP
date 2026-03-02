package P2SmartHomeSensor;

import P2SmartHomeSensor.sensors.LightSensor;
import P2SmartHomeSensor.sensors.Sensor;
import P2SmartHomeSensor.sensors.SoundSensor;
import P2SmartHomeSensor.sensors.TemparatureSensor;

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
