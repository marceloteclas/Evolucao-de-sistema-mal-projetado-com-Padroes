package main.java.com.fase3;

public class SensorLuminosidade implements Sensor {
    @Override
    public void coletar() {
        System.out.println("Luminosidade: 300 lux");
    }
}
