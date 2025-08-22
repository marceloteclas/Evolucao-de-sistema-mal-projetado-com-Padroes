package main.java.com;

import main.java.com.fase1.sistemaMonitoramento;
import main.java.com.fase3.SistemaMonitoramentoRefatorado;
import main.java.com.fase3.SalaFacade;

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
        SalaFacade sala = new SalaFacade();
        sala.cadastrarSensor("temperatura");
        sala.cadastrarSensor("presenca");
        sala.cadastrarSensor("luminosidade");

        sala.coletarDados();
        sala.gerarRelatorio();


    }
}

