public class FezCheckIn implements CheckIn {
    private View v;
    private Estoque e;

    public void setV(View view) {
        this.v = view;
    }

    @Override
    public void fazerCheckIn() {
        e.adicionarItem();
        v.update(e.getItens());
    }
}
