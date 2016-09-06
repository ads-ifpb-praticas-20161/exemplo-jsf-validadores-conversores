package br.edu.ifpb.praticas.jsf.entidade;

import javax.enterprise.context.RequestScoped;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by diogomoreira on 28/08/16.
 */
@Entity
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String sobrenome;

    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    private String cpf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
