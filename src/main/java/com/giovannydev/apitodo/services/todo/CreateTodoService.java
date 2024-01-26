package com.giovannydev.apitodo.services.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.giovannydev.apitodo.domain.todo.Todos;
import com.giovannydev.apitodo.domain.todo.TodosRepository;
import com.giovannydev.apitodo.domain.todo.DTOs.RequestCreateTodoDTO;

@Service
public class CreateTodoService {

  @Autowired
  private TodosRepository repository;

  public ResponseEntity<Todos> createTodo(RequestCreateTodoDTO data) {
    Todos newTodo = new Todos(data);
    Todos todo = repository.save(newTodo);
    return ResponseEntity.ok(todo);
  }
}
