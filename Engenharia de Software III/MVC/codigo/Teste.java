public class Teste {
    public static void main(String[] args) {
        View view = new View();
        Estoque estoque = new Estoque();
        CheckIn fezCheckIn = new FezCheckIn();
        CheckIn naoFezCheckIn = new NaoFezCheckIn();
        Registro registro = new Registro();

        view.setC(fezCheckIn);
        fezCheckIn.setV(view);
        naoFezCheckIn.setV(view);

        registro.registerObserver(view);

        Sistema sistema1 = new Sistema();
        sistema1.setNomeCliente("Cliente A");
        registro.addSistema(sistema1);

        fezCheckIn.fazerCheckIn();

        Sistema sistema2 = new Sistema();
        sistema2.setNomeCliente("Cliente B");
        registro.buscarSistema(sistema2);

        view.imprimirDadosSistema();
    }
}
