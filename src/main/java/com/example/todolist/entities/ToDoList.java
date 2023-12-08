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

}
