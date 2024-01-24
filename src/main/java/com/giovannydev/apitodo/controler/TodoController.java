package com.giovannydev.apitodo.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-todo/todo")
public class TodoController {
  
  @GetMapping
  public ResponseEntity<String> listTodos() {
    return ResponseEntity.ok("testing");
  }
}
