package main.java.com.fase3;

public class SensorTemperatura implements Sensor {
    @Override
    public void coletar() {
        System.out.println("Coletando temperatura: 25ºC");
    }
}