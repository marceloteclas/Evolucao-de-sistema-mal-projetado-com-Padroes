package main.java.com.fase3;

public class SensorTemperatura implements Sensor {
    @Override
    public String coletar() {
        return "Coletando temperatura: 25ºC";
    }
}