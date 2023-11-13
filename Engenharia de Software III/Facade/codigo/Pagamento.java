public class Pagamento {
    public boolean efetuarPagamento(int pedidoId, double valor) {
        System.out.println("Pagamento efetuado com sucesso. Pedido #" + pedidoId + " no valor de R$" + valor);
        return true;
    }
}