package com.giovannydev.apitodo.domain.todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepositoy extends JpaRepository<Todo, Integer> {
  
}