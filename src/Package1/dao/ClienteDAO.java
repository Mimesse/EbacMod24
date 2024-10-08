package Package1.dao;

public class ClienteDAO implements IClienteDao {
    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Não foi possível atualizar!");
    }

    public String salvar() {
        throw new UnsupportedOperationException("Não foi possível salvar");
        //return "Sucesso";
    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Não foi possívelç realizar a busca");
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Não foi possível excluir isto no momento");
    }
}
