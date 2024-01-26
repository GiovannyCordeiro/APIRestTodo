package com.giovannydev.apitodo.services.todo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.giovannydev.apitodo.domain.todo.Todos;
import com.giovannydev.apitodo.domain.todo.TodosRepository;
import com.giovannydev.apitodo.domain.todo.DTOs.RequestUpdateDTO;

import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UpdateTodoService {

  private RequestUpdateDTO bodyRequest;

  @Autowired
  private TodosRepository repository;

  public ResponseEntity<Todos> requestAttTodo(RequestUpdateDTO bodyRequest) {
    this.bodyRequest = bodyRequest;
    Optional<Todos> searchedTodo = repository.findById(bodyRequest.id());
    return verifyIsPresentDB(searchedTodo);
  }

  private ResponseEntity<Todos> verifyIsPresentDB(Optional<Todos> searchedTodo) {
    if(searchedTodo.isPresent()){
      Todos actualTodos = searchedTodo.get();
      return attTodoInDB(actualTodos);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  private ResponseEntity<Todos> attTodoInDB(Todos actualTodo) {
      actualTodo.setName(bodyRequest.name());
      actualTodo.setDescription(bodyRequest.description());
      actualTodo.setCategory(bodyRequest.category());
      actualTodo.setStatus(bodyRequest.status());
      return ResponseEntity.ok().build();
  }
}
