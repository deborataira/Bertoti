import java.util.List;

public class Pedido {
    private List<Item> itens;

    public Pedido(List<Item> itens) {
        this.itens = itens;
    }

    public void fazerPedido() {
        System.out.println("Pedido feito com sucesso.");
    }
}

