package main.java.com.fase3;

import java.util.List;

public class Relatorio {
    public void gerar(List<Sensor> sensores) {
        System.out.println("Relatório:");
        for (Sensor s : sensores) {
            s.coletar(); // reutiliza a lógica de coleta pra mostrar dados no relatório
        }
    }
}
