public class TesteElementosGráficos {
    public static void main(String[] args) {
        ElementoGráfico janela = new Janela(800.0);
        ElementoGráfico caixaDeTexto = new CaixaDeTexto("Arial", "Azul");
        ElementoGráfico icone = new Icone("Estrela");

        System.out.println("Elementos gráficos:");
        janela.desenhar();
        caixaDeTexto.desenhar();
        icone.desenhar();
    }
}