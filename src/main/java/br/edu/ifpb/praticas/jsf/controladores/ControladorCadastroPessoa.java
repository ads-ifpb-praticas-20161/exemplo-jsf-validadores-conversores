package br.edu.ifpb.praticas.jsf.controladores;

import br.edu.ifpb.praticas.jsf.entidade.Pessoa;
import br.edu.ifpb.praticas.jsf.servicos.PessoaServico;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by diogomoreira on 28/08/16.
 */
@Named
@ViewScoped
public class ControladorCadastroPessoa implements Serializable {

    @Inject
    private Pessoa pessoa;

    @Inject
    private PessoaServico servico;

    public String cadastrar() {
        servico.salvar(pessoa);
        return "index?faces-redirect=true";
    }

    public List<Pessoa> listar() {
        return servico.listar();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}
