package Package1.service;

import Package1.dao.ClienteDAO;
import Package1.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDAO;

    public ClienteService(IClienteDao clienteDAO) {
        //clienteDAO = new ClienteDAO();
        //clienteDAO = new ClienteDaoMock();
        this.clienteDAO = clienteDAO;
    }

    public String salvar () {
        clienteDAO.salvar();
        return "Sucesso";
    }

    public String buscar() {
        clienteDAO.buscar();
        return "Buscando...";
    }

    public String excluir() {
        clienteDAO.excluir();
        return "Excluído com Sucesso";
    }

    public String atualizar() {
        clienteDAO.atualizar();
        return "Atualizando...";
    }
}
