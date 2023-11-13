public class TesteControleBronzeamentoArtificial {
    public static void main(String[] args) {
        ControleBronzeamentoArtificial controle = new ControleBronzeamentoArtificial();
        Ajustador ajustador = new Ajustador();
        SistemaMaquinaBronzeadora sistema = new SistemaMaquinaBronzeadora();

        controle.addObserver(ajustador);
        controle.addObserver(sistema);

        double temperatura = 35.0;
        double nivelBronzeDesejado = 0.6;
        double tempoEstimado = 15.0;

        controle.setTemperatura(temperatura);
        controle.setNivelBronzeDesejado(nivelBronzeDesejado);
        controle.setTempoEstimado(tempoEstimado);

        controle.ajuste();
    }
}
