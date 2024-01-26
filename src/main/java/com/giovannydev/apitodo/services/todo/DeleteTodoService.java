package com.giovannydev.apitodo.services.todo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.giovannydev.apitodo.domain.todo.Todos;
import com.giovannydev.apitodo.domain.todo.TodosRepository;
import com.giovannydev.apitodo.domain.todo.DTOs.RequestDeleteDTO;

@Service
@Transactional
public class DeleteTodoService {
  @Autowired
  private TodosRepository repository;

  public ResponseEntity<Todos> requestDeleteTodo(RequestDeleteDTO data){
    return ruleDeleteTodo(data.id());
  }

  private ResponseEntity<Todos> ruleDeleteTodo(Integer idTodo){
    Optional<Todos> searchTodo = repository.findById(idTodo);
    if(searchTodo.isPresent()){
      return deleteTodo(idTodo);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  private ResponseEntity<Todos> deleteTodo(Integer idTodo){
    repository.deleteById(idTodo);
    return ResponseEntity.noContent().build();
  }

}
