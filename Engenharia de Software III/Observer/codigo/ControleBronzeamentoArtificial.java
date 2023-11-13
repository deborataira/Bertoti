import java.util.ArrayList;
import java.util.List;

public class ControleBronzeamentoArtificial {
    private double temperatura;
    private double nivelBronzeDesejado;
    private double tempoEstimado;
    private List<Observer> observers = new ArrayList<>();

    public double setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        return this.temperatura;
    }

    public double setNivelBronzeDesejado(double nivelBronzeDesejado) {
        this.nivelBronzeDesejado = nivelBronzeDesejado;
        return this.nivelBronzeDesejado;
    }

    public double setTempoEstimado(double tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
        return this.tempoEstimado;
    }

    public void ajuste() {
        double ajuste = Math.abs(temperatura - 37.0) * 0.2;
        nivelBronzeDesejado += ajuste;
        tempoEstimado -= ajuste;

        for (Observer observer : observers) {
            observer.ajustar(temperatura, nivelBronzeDesejado, tempoEstimado);
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }
}

