package br.edu.ifpb.praticas.jsf.servicos;

import br.edu.ifpb.praticas.jsf.entidade.Pessoa;
import br.edu.ifpb.praticas.jsf.repositorios.Repositorio;

import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 * Created by diogomoreira on 04/09/16.
 */
public class PessoaServico implements Serializable {

    @Inject
    private Repositorio<Pessoa> repositorio;

    public void salvar(Pessoa p) {
        repositorio.salvar(p);
    }

    public List<Pessoa> listar() {
        return repositorio.listarTodos();
    }

}
