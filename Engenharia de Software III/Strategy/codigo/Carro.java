public class Carro implements Marca {
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void registrarMarca() {
        System.out.println("A marca do carro é: " + marca);
    }

    @Override
    public String marca() {
        return marca;
    }
}