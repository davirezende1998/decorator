public class ArCondicionado extends AutomovelDecorator{
    public ArCondicionado(Automovel automovel) {
        super(automovel);
    }

    public float getAumentoDeValor() {
        return 2500;
    }

    public String getNomeCategoria() {
        return "Ar condicionado";
    }
}