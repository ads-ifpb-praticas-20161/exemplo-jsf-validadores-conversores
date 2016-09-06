package br.edu.ifpb.praticas.jsf.repositorios;

import java.util.List;

/**
 * Created by diogomoreira on 04/09/16.
 */
public interface Repositorio<E> {

    void salvar(E obj);

    void remover(E obj);

    E consultar(Long id);

    List<E> listarTodos();

}
