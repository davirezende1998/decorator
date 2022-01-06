public class Turbo extends AutomovelDecorator{
    public Turbo(Automovel automovel) {
        super(automovel);
    }

    public float getAumentoDeValor() {
        return 5000;
    }

    public String getNomeCategoria() {
        return "Turbo";
    }
}