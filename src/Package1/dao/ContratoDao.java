package Package1.dao;

public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException(" Não funciona com o banco ");
    }

    @Override
    public String buscar() {
        throw new UnsupportedOperationException(" Não foi possível realizar a busca ") ;
    }

    @Override
    public String excluir() {
        throw new UnsupportedOperationException(" Não foi possível excluir ");
    }

    @Override
    public String atualizar() {
        throw new UnsupportedOperationException(" Erro ao atualizar! ");
    }
}
