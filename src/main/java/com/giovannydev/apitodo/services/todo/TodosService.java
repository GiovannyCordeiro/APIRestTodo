package com.giovannydev.apitodo.services.todo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovannydev.apitodo.domain.todo.TodosRepository;
import com.giovannydev.apitodo.domain.todo.Todos;

@Service
public class TodosService {

  @Autowired
  private TodosRepository repository;

  public List<Todos> getAllTodos() {
    List<Todos> listTodos = repository.findAll();
    return listTodos;
  }
}
