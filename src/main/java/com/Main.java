package main.java.com;

import main.java.com.fase1.sistemaMonitoramento;
import main.java.com.fase3.SistemaMonitoramentoRefatorado;
import main.java.com.fase3.AlarmeObserver;
import main.java.com.fase3.RelatorioObserver;
import main.java.com.fase3.SalaFacade;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== FASE 1 - Sistema Mal Projetado =====");
        sistemaMonitoramento sistema1 = new sistemaMonitoramento();

        sistema1.cadastrarSensor("temperatura");
        sistema1.cadastrarSensor("presenca");
        sistema1.cadastrarSensor("luminosidade");

        sistema1.coletarDados();
        sistema1.gerarRelatorio();
 
        System.out.println("\n===== FASE 3 - Sistema Refatorado =====");
        // SistemaMonitoramentoRefatorado sistema2 = new SistemaMonitoramentoRefatorado();
        SalaFacade sala = new SalaFacade();
        sala.cadastrarSensor("temperatura");
        sala.cadastrarSensor("presenca");
        sala.cadastrarSensor("luminosidade");

        // Registrando observadores
        sala.addObserver(new RelatorioObserver("[Relatório]"));
        sala.addObserver(new AlarmeObserver("[Alarme]"));

        sala.coletarDados();
        sala.gerarRelatorio();

        //Simulação de 3 ciclos
        for (int i = 0; i < 3; i++) {
            System.out.println(">>> Ciclo " + (i+1));
            sala.coletarDados();
            System.out.println();
        }
    }
}

