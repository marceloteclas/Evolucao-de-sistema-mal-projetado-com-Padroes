package main.java.com.fase3;

public class AlarmeObserver implements Observer {
    private String name;

    public AlarmeObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String state) {
        if (state.contains("true")) {
            System.out.println(name + " Alerta! Presença detectada.");
        }
    }

}
