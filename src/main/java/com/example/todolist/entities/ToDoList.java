package com.example.todolist.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_toDoList")
public class ToDoList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 30)
    private String nome;
    @Column(length = 255)
    private String descricao;
    @Column
    private RealizadoEnum realizado;
    @Column
    private PrioridadeEnum prioridade;

    public ToDoList() {
    }

    public ToDoList(Long id, String nome, String descricao, RealizadoEnum realizado, PrioridadeEnum prioridade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.realizado = realizado;
        this.prioridade = prioridade;
    }

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public RealizadoEnum getRealizado() {
        return realizado;
    }

    public void setRealizado(RealizadoEnum realizado) {
        this.realizado = realizado;
    }

    public PrioridadeEnum getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(PrioridadeEnum prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", realizado=" + realizado +
                ", prioridade=" + prioridade +
                '}';
    }
}
