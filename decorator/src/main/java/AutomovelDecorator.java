public abstract class AutomovelDecorator implements Automovel{
    private Automovel automovel;
    public String categoria;

    public AutomovelDecorator(Automovel automovel) {
        this.automovel = automovel;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public abstract float getAumentoDeValor();

    public float getPreco() {
        return this.automovel.getPreco() + this.getAumentoDeValor();
    }

    public abstract String getNomeCategoria();

    public String getCategoria() {
        return this.automovel.getCategoria() + "/" + this.getNomeCategoria();
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}