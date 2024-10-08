import Package1.dao.*;
import Package1.dao.mock.ContratoDaoMock;
import Package1.service.ClienteService;
import Package1.service.ContratoService;
import Package1.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest(){
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.buscar();
        Assert.assertEquals("Buscando...", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarTest() {
        IClienteDao mockDAO = new ClienteDAO();
        ClienteService service = new ClienteService(mockDAO);
        String retorno = service.buscar();
        Assert.assertEquals("Buscando...", retorno);
    }

    @Test
    public void excluirTest() {
        ClienteDaoMock mockDAO = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDAO);
        String retorno = service.excluir();
        Assert.assertEquals("Excluído com Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirTest() {
        IClienteDao mockDAO = new ClienteDAO();
        ClienteService service = new ClienteService(mockDAO);
        String retorno = service.excluir();
        Assert.assertEquals("Excluído com Sucesso", retorno);
    }

    @Test
    public void atualizarTest(){
        ClienteDaoMock mockDAO =  new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDAO);
        String retorno = service.atualizar();
        Assert.assertEquals("Atualizando...", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarTest() {
        IClienteDao mockDAO = new ClienteDAO();
        ClienteService service =  new ClienteService(mockDAO);
        String retorno = service.atualizar();
        Assert.assertEquals("Atualizando...", retorno);
    }
}
