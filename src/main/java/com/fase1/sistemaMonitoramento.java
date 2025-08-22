package main.java.com.fase1;

import java.util.ArrayList;
import java.util.List;

public class sistemaMonitoramento {

    private List<String> sensores = new ArrayList<>();

    public void cadastrarSensor(String tipo) {
        sensores.add(tipo);
        System.out.println("Sensor cadastrado: " + tipo);
    }

    public void coletarDados() {
        for (String s : sensores) {
            if (s.equals("temperatura")) {
                System.out.println("Coletando temperatura: 25ºC");
            } else if (s.equals("presenca")) {
                System.out.println("Detectando presença: true");
                System.out.println(">>> Acionando luz");
            } else if (s.equals("luminosidade")) {
                System.out.println("Luminosidade: 300 lux");
            }
        }
    }

    public void gerarRelatorio() {
        System.out.println("Relatório:");
        for (String s : sensores) {
            System.out.println("Sensor: " + s + " - Dados coletados...");
        }
    }


}
