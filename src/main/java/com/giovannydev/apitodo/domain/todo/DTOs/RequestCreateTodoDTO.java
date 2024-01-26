package com.giovannydev.apitodo.domain.todo.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestCreateTodoDTO (
  @NotBlank
  String name,
  String description,
  String category,
  @NotNull
  Boolean status
){}