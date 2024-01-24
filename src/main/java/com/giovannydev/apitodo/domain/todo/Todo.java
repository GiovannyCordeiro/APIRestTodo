package com.giovannydev.apitodo.domain.todo;

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

@Table(name="Todo")
@Entity(name="Todo")
@EqualsAndHashCode(of="id")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Integer id;

  private String name;

  private String description;

  private String category;

  private Boolean status;
}