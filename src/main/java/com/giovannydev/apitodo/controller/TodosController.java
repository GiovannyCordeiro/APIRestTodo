package com.giovannydev.apitodo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giovannydev.apitodo.domain.todo.Todos;
import com.giovannydev.apitodo.services.todo.TodosService;

@RestController
@RequestMapping("/api-todos/todos")
public class TodosController {

  private final TodosService todoService;

  public TodosController(TodosService todoService){
    this.todoService = todoService;
  }
  
  @GetMapping
  public ResponseEntity<List<Todos>> listTodos() {
    return ResponseEntity.ok(todoService.getAllTodos());
  }
}
