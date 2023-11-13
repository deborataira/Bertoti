import java.util.List;

public class Registro implements Subject {
    private List<Sistema> sistema;
    private List<Observer> observers;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers(List<Sistema> encontrados) {
        for (Observer o : observers) {
            o.update(encontrados);
        }
    }

    public void addSistema(Sistema s) {
        sistema.add(s);
    }

    public void buscarSistema(Sistema s) {
        List<Sistema> encontrados = new ArrayList<>();
        for (Sistema sistema : sistema) {
            if (sistema.matches(s)) {
                encontrados.add(sistema);
            }
        }
        notifyObservers(encontrados);
    }
}
