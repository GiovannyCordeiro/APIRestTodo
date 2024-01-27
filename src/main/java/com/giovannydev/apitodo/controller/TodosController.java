package com.giovannydev.apitodo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giovannydev.apitodo.domain.todo.Todos;
import com.giovannydev.apitodo.domain.todo.DTOs.RequestCreateTodoDTO;
import com.giovannydev.apitodo.domain.todo.DTOs.RequestDeleteDTO;
import com.giovannydev.apitodo.domain.todo.DTOs.RequestUpdateDTO;
import com.giovannydev.apitodo.services.todo.CreateTodoService;
import com.giovannydev.apitodo.services.todo.DeleteTodoService;
import com.giovannydev.apitodo.services.todo.GetTodosService;
import com.giovannydev.apitodo.services.todo.UpdateTodoService;

@RestController
@RequestMapping("/api-todos/todos")
public class TodosController {

  private final GetTodosService getTodoService;
  private final CreateTodoService createTodo;
  private final UpdateTodoService updateTodo;
  private final DeleteTodoService deleteTodo;

  public TodosController(
      GetTodosService getTodoService,
      CreateTodoService createTodo,
      UpdateTodoService updateTodo,
      DeleteTodoService deleteTodo) {
    this.getTodoService = getTodoService;
    this.createTodo = createTodo;
    this.updateTodo = updateTodo;
    this.deleteTodo = deleteTodo;
  }

  @GetMapping
  public ResponseEntity<List<Todos>> listTodos() {
    return getTodoService.responseTodoListUser();
  }

  @PostMapping
  public ResponseEntity<Todos> createTodo(@RequestBody @Validated RequestCreateTodoDTO data) {
    return createTodo.createTodo(data);
  }

  @PutMapping
  public ResponseEntity<Todos> updateTodo(@Validated @RequestBody RequestUpdateDTO data) {
    return updateTodo.requestAttTodo(data);
  }

  @DeleteMapping
  public ResponseEntity deleteTodo(@Validated @RequestBody RequestDeleteDTO data) {
    return deleteTodo.requestDeleteTodo(data);
  }
}
