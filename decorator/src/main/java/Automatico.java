public class Automatico extends AutomovelDecorator{
    public Automatico(Automovel automovel) {
        super(automovel);
    }

    public float getAumentoDeValor() {
        return 3500;
    }

    public String getNomeCategoria() {
        return "Automatico";
    }
}