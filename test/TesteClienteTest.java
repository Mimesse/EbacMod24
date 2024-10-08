import Package1.TesteCliente;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TesteClienteTest {

    @Test
    public void testeClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Gustavo");

        Assert.assertEquals("Gustavo", cli.getNome());
    }

}