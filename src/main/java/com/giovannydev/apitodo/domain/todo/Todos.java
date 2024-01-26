package com.giovannydev.apitodo.domain.todo;

import com.giovannydev.apitodo.domain.todo.DTOs.RequestCreateTodoDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="todos")
@Entity(name="todos")
@EqualsAndHashCode(of="id")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Todos {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;

  private String description;

  private String category;

  private Boolean status;

  public Todos(RequestCreateTodoDTO requestTodo){
    this.name = requestTodo.name();
    this.description = requestTodo.description();
    this.category = requestTodo.category();
    this.status = requestTodo.status();
  }
}