package main.java.com;

import main.java.com.fase1.sistemaMonitoramento;
import main.java.com.fase3.SistemaMonitoramentoRefatorado;

public class main {
    public static void main(String[] args) {
        System.out.println("===== FASE 1 - Sistema Mal Projetado =====");
        sistemaMonitoramento sistema1 = new sistemaMonitoramento();

        sistema1.cadastrarSensor("temperatura");
        sistema1.cadastrarSensor("presenca");
        sistema1.cadastrarSensor("luminosidade");

        sistema1.coletarDados();
        sistema1.gerarRelatorio();

        System.out.println("\n===== FASE 3 - Sistema Refatorado =====");
        SistemaMonitoramentoRefatorado sistema3 = new SistemaMonitoramentoRefatorado();

        sistema3.cadastrarSensor("temperatura");
        sistema3.cadastrarSensor("presenca");
        sistema3.cadastrarSensor("luminosidade");

        sistema3.coletarDados();
    }
}

