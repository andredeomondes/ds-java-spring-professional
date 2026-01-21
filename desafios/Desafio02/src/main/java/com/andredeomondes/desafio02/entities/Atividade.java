package com.andredeomondes.desafio02.entities;

import jakarta.persistence.*;

import java.util.*;

// Entidade Atividade representando uma atividade com atributos e relacionamentos
@Entity
// Tabela mapeada para "tb_atividade"
@Table(name = "tb_atividade")
public class Atividade {

    // Atributos da entidade Atividade
    @Id
    // Chave primária com geração automática de valor
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;

    // Coluna de descrição com definição de tipo TEXT
    @Column(columnDefinition = "TEXT")
    // Descrição da atividade
    private String description;

    private Double price;

    // Relacionamento Many-to-One com a entidade Categoria
    @ManyToOne
    // Chave estrangeira para a categoria
    @JoinColumn(name = "categoria_id")
    // Categoria associada à atividade
    private Categoria categoria;

    public Long getId() {
        return id;
    }

    // Relacionamento One-to-Many com a entidade Bloco
    @OneToMany(mappedBy = "atividade")
    // Lista de blocos associados à atividade
    private List<Bloco> blocos = new ArrayList<>();


    // Relacionamento Many-to-Many com a entidade Participante
    @ManyToMany(mappedBy = "atividades")
    // Conjunto de participantes associados à atividade
    private Set<Participante> participantes = new HashSet<>();

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Bloco> getBlocos() {
        return blocos;
    }

    public Set<Participante> getParticipantes() {
        return participantes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Atividade atividade = (Atividade) o;
        return Objects.equals(id, atividade.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
