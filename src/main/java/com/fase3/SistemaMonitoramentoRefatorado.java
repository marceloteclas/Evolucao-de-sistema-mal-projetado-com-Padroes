package main.java.com.fase3;

import java.util.ArrayList;
import java.util.List;

public class SistemaMonitoramentoRefatorado {

    private List<Sensor> sensores = new ArrayList<>();

    public void cadastrarSensor(String tipo) {
        Sensor sensor = SensorFactory.criarSensor(tipo);
        sensores.add(sensor);
        System.out.println("Sensor cadastrado: " + tipo);
    }

    public void coletarDados() {
        for (Sensor s : sensores) {
            executarColeta(s); // método extraído
        }
    }

    private void executarColeta(Sensor s) {
        s.coletar();
    }

}
