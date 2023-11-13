import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<String, Integer> stock;

    public Estoque() {
        stock = new HashMap<>();
        stock.put("Produto A", 5);
        stock.put("Produto B", 10);
    }

    public boolean verificar(Item item) {
        if (stock.containsKey(item.getNome())) {
            int quantidadeEmEstoque = stock.get(item.getNome());
            return quantidadeEmEstoque > 0;
        }
        return false;
    }
}
