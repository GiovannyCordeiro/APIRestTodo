package com.giovannydev.apitodo.domain.todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodosRepository extends JpaRepository<Todos, Integer> {

}
