public class CaixaDeTexto implements ElementoGráfico {
    private String fontTexto;
    private String corTexto;

    public CaixaDeTexto(String fontTexto, String corTexto) {
        this.fontTexto = fontTexto;
        this.corTexto = corTexto;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando uma caixa de texto com fonte " + fontTexto + " e cor " + corTexto);
    }
}