package main.java.com.fase3;

public interface Sensor {
    String coletar();

    // Reação opcional a eventos de outros sensores
    default void reagir(String evento) {
        // padrão: não faz nada
    }
}
