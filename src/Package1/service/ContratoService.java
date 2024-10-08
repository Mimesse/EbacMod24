package Package1.service;

import Package1.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;


    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        return "Buscando";
    }

    @Override
    public String excluir() {
        return "Exluído com Sucesso";
    }

    @Override
    public String atualizar() {
        return "Atualizando...";
    }
}
