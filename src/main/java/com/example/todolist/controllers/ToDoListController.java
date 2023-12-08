package com.example.todolist.controllers;

import com.example.todolist.entities.ToDoList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/toDoList")
public class ToDoListController implements Controller<ToDoList> {
    @PostMapping
    @Override
    public ResponseEntity<ToDoList> salvar(ToDoList toDoList) {
        return null;
    }

    @GetMapping
    @Override
    public ResponseEntity<List<ToDoList>> consultar() {
        return null;
    }

    @GetMapping
    @Override
    public ResponseEntity<Object> consultar(Long id) {
        return null;
    }

    @PutMapping
    @Override
    public ResponseEntity<Object> alterar(Long id, ToDoList toDoList) {
        return null;
    }

    @DeleteMapping
    @Override
    public ResponseEntity<Object> excluir(Long id) {
        return null;
    }
}
