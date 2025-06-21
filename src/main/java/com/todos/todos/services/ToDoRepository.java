package com.todos.todos.services;

import com.todos.todos.models.ToDo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ToDoRepository  extends CrudRepository<ToDo, Integer> {
    List<ToDo> findAllByOrderByIdAsc();
}
