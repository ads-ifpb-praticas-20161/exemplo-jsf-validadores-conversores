package br.edu.ifpb.praticas.jsf.repositorios;

import br.edu.ifpb.praticas.jsf.entidade.Pessoa;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.io.Serializable;
import java.util.List;

/**
 * Created by diogomoreira on 04/09/16.
 */
public class PessoaRepositorio implements Repositorio<Pessoa>, Serializable {

    @Inject
    private EntityManager em;

    @Override
    public void salvar(Pessoa obj) {
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
    }

    @Override
    public void remover(Pessoa obj) {
        em.remove(obj);
    }

    @Override
    public Pessoa consultar(Long id) {
        return em.find(Pessoa.class, id);
    }

    @Override
    public List<Pessoa> listarTodos() {
        Query q = em.createQuery("SELECT p FROM Pessoa p");
        return q.getResultList();
    }
}
