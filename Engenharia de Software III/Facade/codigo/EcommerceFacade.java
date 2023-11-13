import java.util.List;

public class EcommerceFacade {
    public boolean validarPedido(Cliente cliente, List<Item> itens) {
        return verificarEstoque(itens) && validarCompra(cliente, new Pedido(itens));
    }

    public String rastrearPedido(int pedidoId) {
        return "Pedido #" + pedidoId + " está em trânsito";
    }

    public double somarPreço(List<Item> itens) {
        double total = 0.0;
        for (Item item : itens) {
            total += item.getPreço();
        }
        return total;
    }

    public boolean verificarEstoque(List<Item> itens) {
        Estoque estoque = new Estoque();
        for (Item item : itens) {
            if (!estoque.verificar(item)) {
                return false;
            }
        }
        return true;
    }

    public boolean processarPagamento(int pedidoId, double valor) {
        Pagamento pagamento = new Pagamento();
        return pagamento.efetuarPagamento(pedidoId, valor);
    }

    public boolean validarCompra(Cliente cliente, Pedido pedido) {
        return true;
    }
}

