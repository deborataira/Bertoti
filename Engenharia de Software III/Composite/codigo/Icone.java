public class Icone implements ElementoGráfico {
    private String forma;

    public Icone(String forma) {
        this.forma = forma;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um ícone com a forma " + forma);
    }
}