package main.java.com.fase3;

public class SensorPresenca implements Sensor {
    @Override
    public void coletar() {
        System.out.println("Detectando presença: true");
        System.out.println(">>> Acionando luz");
    }
}
