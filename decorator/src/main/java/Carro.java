public class Carro implements Automovel{
    public float preco;

    public Carro() {
    }

    public Carro(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getCategoria() {
        return "Carro Popular";
    }
}