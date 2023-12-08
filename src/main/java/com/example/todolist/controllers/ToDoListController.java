package com.example.todolist.controllers;

import com.example.todolist.entities.ToDoList;
import com.example.todolist.repositories.ToDoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/toDoList")
public class ToDoListController implements Controller<ToDoList> {

    @Autowired
    ToDoListRepository toDoListRepository;

    @PostMapping
    @Override
    public ResponseEntity<ToDoList> salvar(@RequestBody ToDoList toDoList) {
        toDoListRepository.save(toDoList);
        return ResponseEntity.status(HttpStatus.CREATED).body(toDoList);
    }

    @GetMapping
    @Override
    public ResponseEntity<List<ToDoList>> consultar() {
        return ResponseEntity.status(HttpStatus.OK).body(toDoListRepository.findAll());
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Object> consultar(@PathVariable("id") Long id) {
        Optional<ToDoList> toDoListOptional = toDoListRepository.findById(id);
        try {
            ToDoList toDoList = toDoListOptional.get();
            return ResponseEntity.status(HttpStatus.OK).body(toDoList);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ToDoList não encontrado");
        }
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<Object> alterar(@PathVariable("id") Long id, @RequestBody ToDoList toDoList) {
        Optional<ToDoList> toDoListOptional = toDoListRepository.findById(id);
        try {
            ToDoList toDoListX = toDoListOptional.get();
            toDoListX.setNome(toDoList.getNome());
            toDoListX.setDescricao(toDoList.getDescricao());
            toDoListX.setRealizado(toDoList.getRealizado());
            toDoListX.setPrioridade(toDoList.getPrioridade());
            toDoListRepository.save(toDoListX);
            return ResponseEntity.status(HttpStatus.OK).body(toDoListX);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ToDoList não encontrado");
        }
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<Object> excluir(@PathVariable("id") Long id) {
        Optional<ToDoList> optionalToDoList = toDoListRepository.findById(id);
        try {
            ToDoList toDoList = optionalToDoList.get();
            toDoListRepository.delete(toDoList);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
