package com.giovannydev.apitodo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giovannydev.apitodo.domain.todo.RequestCreateTodoDTO;
import com.giovannydev.apitodo.domain.todo.Todos;
import com.giovannydev.apitodo.services.todo.CreateTodoService;
import com.giovannydev.apitodo.services.todo.GetTodosService;

@RestController
@RequestMapping("/api-todos/todos")
public class TodosController {

  private final GetTodosService getTodoService;
  private final CreateTodoService createTodo;

  public TodosController(GetTodosService getTodoService, CreateTodoService createTodo){
    this.getTodoService = getTodoService;
    this.createTodo = createTodo;
  }

  @GetMapping
  public ResponseEntity<List<Todos>> listTodos() {
    return getTodoService.responseTodoListUser();
  }

  @PostMapping
  public ResponseEntity<Todos> createTodo(@RequestBody @Validated RequestCreateTodoDTO data){
    return createTodo.createTodo(data);
  }
}
