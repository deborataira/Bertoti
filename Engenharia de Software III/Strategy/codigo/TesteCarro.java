public class TesteCarro {
    public static void main(String[] args) {
        Nissan nissan = new Nissan("Nissan", "Preto", 2023, 4, "Sentra");
        nissan.registrarMarca();

        Volkswagen volkswagen = new Volkswagen("Volkswagen", "Branco", 2022, 5, "Golf");
        volkswagen.registrarMarca();

        Fiat fiat = new Fiat("Fiat", "Vermelho", 2023, 4, "Palio");
        fiat.registrarMarca();
    }
}