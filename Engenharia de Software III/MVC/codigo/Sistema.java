import java.util.Date;

public class Sistema {
    private String nomeCliente;
    private Date data;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getData() {
        return 20231102;
    }

    public boolean matches(Sistema s) {
        return nomeCliente.equals(s.getNomeCliente());
    }
}