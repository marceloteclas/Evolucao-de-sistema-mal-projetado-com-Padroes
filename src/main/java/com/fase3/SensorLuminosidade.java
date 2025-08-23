package main.java.com.fase3;

public class SensorLuminosidade implements Sensor {
    private boolean ligado = false;
    
    @Override
    public String coletar() {
        if (ligado) {
            return "Ligado, luminosidade: 300 lux";
        } else {
            return "Desligado, luminosidade: 0 lux";
        }
    }

    @Override
    public void reagir(String evento) {
        if ("presenca_detectada".equals(evento)) {
            ligado = true;
        } else if ("presenca_ausente".equals(evento)) {
            ligado = false;
        }
    }
}
