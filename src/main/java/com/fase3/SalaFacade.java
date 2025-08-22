package main.java.com.fase3;

public class SalaFacade {

    private final SistemaMonitoramentoRefatorado sistema = new SistemaMonitoramentoRefatorado();
    private final Relatorio relatorio = new Relatorio();

    public void cadastrarSensor(String tipo) {
        sistema.cadastrarSensor(tipo);
    }

    public void coletarDados() {
        sistema.coletarDados();
    }

    public void gerarRelatorio() {
        relatorio.gerar(sistema.getSensores());
    }
}
