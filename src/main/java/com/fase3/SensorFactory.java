package main.java.com.fase3;

public class SensorFactory {
    public static Sensor criarSensor(String tipo) {
        if (tipo.equalsIgnoreCase("temperatura")) {
            return new SensorTemperatura();
        } else if (tipo.equalsIgnoreCase("presenca")) {
            return new SensorPresenca();
        } else if (tipo.equalsIgnoreCase("luminosidade")) {
            return new SensorLuminosidade();
        }
        throw new IllegalArgumentException("Tipo de sensor inválido!");
    }
}
