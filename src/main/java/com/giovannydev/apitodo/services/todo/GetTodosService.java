package com.giovannydev.apitodo.services.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.giovannydev.apitodo.domain.todo.TodosRepository;
import com.giovannydev.apitodo.domain.todo.Todos;

@Service
public class GetTodosService {

  @Autowired
  private TodosRepository repository;

  private List<Todos> getAllTodos() {
    return repository.findAll();
  }

  private ResponseEntity<List<Todos>> ruleResponseUser() {
    List<Todos> allTodos = this.getAllTodos();
    if (allTodos.size() == 0) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(allTodos);
  }

  public ResponseEntity<List<Todos>> responseTodoListUser() {
    return ruleResponseUser();
  }

}
