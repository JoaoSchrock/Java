package com.example.demo.api.model.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String nome;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Categoria))
            return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(getCodigo(), categoria.getCodigo()) && Objects.equals(getNome(), categoria.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }
}