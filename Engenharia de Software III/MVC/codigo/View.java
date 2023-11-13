import java.util.List;

public class View implements Observer {
    private CheckIn c;
    private List<Sistema> listaSistema;

    public void setC(CheckIn checkIn) {
        this.c = checkIn;
    }

    @Override
    public void update(List<Item> items) {
    }

    public void imprimirDadosSistema() {
        for (Sistema sistema : listaSistema) {
            System.out.println("Nome do Cliente: " + sistema.getNomeCliente());
            System.out.println("Data: " + sistema.getData());
        }
    }

    public void registrarCheckIn() {
        c.fazerCheckIn();
    }
}