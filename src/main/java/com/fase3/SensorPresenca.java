package main.java.com.fase3;

public class SensorPresenca implements Sensor {
    private boolean presenca = false; // Padrão inicial
    
    @Override
    public String coletar() {
        detectarPresenca();
        if (presenca) {
            return "Detectando presença: true\n>>> Acionando luz";
        } else {
            return "Detectando presença: false\n>>> Luz desligada";
        }
    }

    private void detectarPresenca() {
        // Simulação de detecção de presença
        this.presenca = !this.presenca; // Alterna entre true e false para simulação
    }

    public boolean isPresenca() {
        return presenca;
    }
}
