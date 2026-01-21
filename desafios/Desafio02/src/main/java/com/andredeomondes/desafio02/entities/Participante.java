package com.andredeomondes.desafio02.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

// Entidade Participante representando um participante com atributos e relacionamentos
@Entity
// Tabela mapeada para "tb_participante"
@Table(name = "tb_participante")
public class Participante {

    // Atributos da entidade Participante
    @Id
    // Chave primária com geração automática de valor
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique=true)
    private String email;

    // Relacionamento Many-to-Many com a entidade Atividade
    @ManyToMany
    // Tabela de junção para o relacionamento Many-to-Many
    @JoinTable(name = "tb_participante_atividade",
            joinColumns = @JoinColumn(name = "participante_id"),
            inverseJoinColumns = @JoinColumn(name = "atividade_id")
    )
    private Set<Atividade> atividades = new HashSet<>();

    public Participante() {
    }

    public Participante(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Atividade> getAtividades() {
        return atividades;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Participante that = (Participante) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
