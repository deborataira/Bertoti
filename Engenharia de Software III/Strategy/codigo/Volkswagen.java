public class Volkswagen extends Carro {
    private String cor;
    private int ano;
    private int qtdPortas;
    private String modelo;

    public Volkswagen(String marca, String cor, int ano, int qtdPortas, String modelo) {
        setMarca(marca);
        this.cor = cor;
        this.ano = ano;
        this.qtdPortas = qtdPortas;
        this.modelo = modelo;
    }
}