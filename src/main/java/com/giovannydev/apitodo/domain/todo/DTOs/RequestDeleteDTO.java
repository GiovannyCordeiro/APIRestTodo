package com.giovannydev.apitodo.domain.todo.DTOs;

import jakarta.validation.constraints.NotNull;

public record RequestDeleteDTO (
  @NotNull
  Integer id
){}
