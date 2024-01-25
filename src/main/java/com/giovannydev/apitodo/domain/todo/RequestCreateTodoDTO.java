package com.giovannydev.apitodo.domain.todo;

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