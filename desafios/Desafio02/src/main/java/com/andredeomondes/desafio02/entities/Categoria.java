package com.andredeomondes.desafio02.entities;

import jakarta.persistence.*;

import java.util.*;

// Entidade Categoria representando uma categoria de atividades
@Entity
// Tabela mapeada para "tb_categoria"
@Table(name = "tb_categoria")
public class Categoria {

    // Atributos da entidade Categoria
    @Id
    // Chave primária com geração automática de valor
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Coluna de descrição com definição de tipo TEXT
    @Column(columnDefinition = "TEXT")
    private String description;

    // Relacionamento One-to-Many com a entidade Atividade
    @OneToMany(mappedBy = "categoria")
    // Conjunto de atividades associadas à categoria
    List<Atividade> atividades = new ArrayList<>();

    public Categoria(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(id, categoria.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
