package com.giovannydev.apitodo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giovannydev.apitodo.domain.todo.Todos;
import com.giovannydev.apitodo.services.todo.GetTodosService;

@RestController
@RequestMapping("/api-todos/todos")
public class TodosController {

  private final GetTodosService todoService;

  public TodosController(GetTodosService todoService){
    this.todoService = todoService;
  }

  @GetMapping
  public ResponseEntity<List<Todos>> listTodos() {
    return todoService.responseTodoListUser();
  }
}
