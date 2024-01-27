package com.giovannydev.apitodo.domain.todo.DTOs;

import jakarta.validation.constraints.NotNull;

public record RequestUpdateDTO(
    @NotNull Integer id,
    String name,
    String description,
    String category,
    Boolean status) {
}
