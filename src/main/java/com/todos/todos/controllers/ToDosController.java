package com.todos.todos.controllers;

import com.todos.todos.models.ToDo;
import com.todos.todos.services.ToDoRepository ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDosController {
    @Autowired
    ToDoRepository  toDoRepository;

    @GetMapping("/todos")
    List<ToDo> read(){
        return toDoRepository.findAllByOrderByIdAsc();
    }
}
