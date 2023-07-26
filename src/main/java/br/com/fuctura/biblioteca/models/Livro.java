package br.com.fuctura.biblioteca.models;

import br.com.fuctura.biblioteca.enums.Tamanho;
import net.bytebuddy.implementation.bind.annotation.Super;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Livro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String autor;
    private String texto;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private String categoria;
    private Tamanho tamanho;

    public Livro() {
        super();
    }

    public Livro(Integer id, String nome, String autor, String texto, String categoria, Tamanho tamanho) {
        super();
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.texto = texto;
        this.categoria = categoria;
        this.tamanho = tamanho;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro livro)) return false;
        return Objects.equals(id, livro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}