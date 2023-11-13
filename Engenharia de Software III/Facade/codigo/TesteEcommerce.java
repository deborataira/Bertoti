import java.util.ArrayList;
import java.util.List;

public class TesteEcommerce {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João");
        List<Item> itens = new ArrayList<>();
        itens.add(new Item("Produto A", 10.0));
        itens.add(new Item("Produto B", 15.0));

        EcommerceFacade ecommerce = new EcommerceFacade();
        Pedido pedido = new Pedido(itens);

        if (ecommerce.validarPedido(cliente, itens)) {
            pedido.fazerPedido();
            double total = ecommerce.somarPreço(itens);
            boolean pagamentoProcessado = ecommerce.processarPagamento(1, total);

            if (pagamentoProcessado) {
                System.out.println(ecommerce.rastrearPedido(1));
            }
        }
    }
}

class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
}

class Item {
    private String nome;
    private double preço;

    public Item(String nome, double preço) {
        this.nome = nome;
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public double getPreço() {
        return preço;
    }
}
