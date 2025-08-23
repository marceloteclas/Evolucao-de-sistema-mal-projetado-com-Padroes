package main.java.com.fase3;

public class RelatorioObserver implements Observer {
    private String name;

    public RelatorioObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String state) {
        System.out.println(name + " recebeu atualização: " + state);
    }

}
