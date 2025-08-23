package main.java.com.fase3;

import java.util.ArrayList;
import java.util.List;

public class SistemaMonitoramentoRefatorado {

    private List<Sensor> sensores = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

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

    private void executarColeta(Sensor sensor) {
        String state = (sensor.coletar());
        System.out.println(state);

        // Se for sensor de presença → dispara evento
        if (sensor instanceof SensorPresenca presenca) {
            if (presenca.isPresenca()) {
                notificarSensores("presenca_detectada", sensor);
            } else {
                notificarSensores("presenca_ausente", sensor);
            }
        }

        notifyObservers(state);
    }

    public List<Sensor> getSensores() {
        return sensores; 
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers(String state) {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

    private void notificarSensores(String evento, Sensor origem) {
        for (Sensor s : sensores) {
            if (s != origem) { // não notifica o próprio
                s.reagir(evento);
            }
        }
    }

}
