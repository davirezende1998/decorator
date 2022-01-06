import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class AutomovelTest {
    @Test
    void deveRetornarPrecoCarro() {
        Automovel automovel = new Carro(50000.0f);
        assertEquals(50000.0f, automovel.getPreco());
    }

    @Test
    void deveRetornarPrecoCarroComTurbo() {
        Automovel automovel = new Turbo(new Carro(50000.0f));
        assertEquals(55000.0f, automovel.getPreco());
    }

    @Test
    void deveRetornarPrecoCarroComArCondicionado() {
        Automovel automovel = new ArCondicionado(new Carro(50000.0f));
        assertEquals(52500.0f, automovel.getPreco());
    }

    @Test
    void deveRetornarPrecoCarroAutomatico() {
        Automovel automovel = new Automatico(new Carro(50000.0f));
        assertEquals(53500.0f, automovel.getPreco());
    }

    @Test
    void deveRetornarPrecoCarroAutomaticoComTurbo() {
        Automovel automovel = new Turbo(new Automatico(new Carro(50000.0f)));
        assertEquals(58500.0f, automovel.getPreco());
    }

    @Test
    void deveRetornarPrecoCarroAutomaticoComTurboComArCondicionado() {
        Automovel automovel = new ArCondicionado(new Turbo(new Automatico(new Carro(50000.0f))));
        assertEquals(61000.0f, automovel.getPreco());
    }

    @Test
    void deveRetornarCategoriaCarro() {
        Automovel automovel = new Carro();
        assertEquals("Carro Popular", automovel.getCategoria());
    }

    @Test
    void deveRetornarCategoriaCarroCompleto() {
        Automovel automovel = new ArCondicionado (new Turbo(new Automatico (new Carro())));
        assertEquals("Carro Popular/Automatico/Turbo/Ar condicionado", automovel.getCategoria());
    }
}