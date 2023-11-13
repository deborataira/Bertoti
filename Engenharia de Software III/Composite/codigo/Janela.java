public class Janela implements ElementoGráfico {
    private double tamanho;

    public Janela(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando uma janela de tamanho " + tamanho);
    }
}