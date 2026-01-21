package com.andredeomondes.desafio02.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Objects;

// Entidade Bloco representando um bloco de tempo associado a uma atividade
@Entity
// Tabela mapeada para "tb_bloco"
@Table(name="tb_bloco")
public class Bloco {
    // Atributos da entidade Bloco
    @Id
    // Chave primária com geração automática de valor
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Coluna de início com definição de tipo TIMESTAMP WITH TIME ZONE
    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private Instant start;
    // Coluna de fim com definição de tipo TIMESTAMP WITH TIME ZONE
    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private Instant end;

    // Relacionamento Many-to-One com a entidade Atividade
    @ManyToOne
    // Chave estrangeira para a atividade
    @JoinColumn(name="atividade_id")
    // Atividade associada ao bloco
    private Atividade atividade;

    public Bloco() {
    }

    public Bloco(Long id, Instant start, Instant end, Atividade atividade) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.atividade = atividade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getStart() {
        return start;
    }

    public void setStart(Instant start) {
        this.start = start;
    }

    public Instant getEnd() {
        return end;
    }

    public void setEnd(Instant end) {
        this.end = end;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bloco bloco = (Bloco) o;
        return Objects.equals(id, bloco.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
