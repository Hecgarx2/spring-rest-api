package com.todos.todos.controllers;

import com.todos.todos.models.ToDo;
import com.todos.todos.services.ToDoRepository ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ToDosController {
    @Autowired
    ToDoRepository  toDoRepository;

    @PostMapping("/todos")
    ToDo create(@RequestBody ToDo todo){
        return toDoRepository.save(todo);
    }

    @GetMapping("/todos")
    List<ToDo> read(){
        return toDoRepository.findAllByOrderByIdAsc();
    }

    @PutMapping("/todos")
    ToDo update(@RequestBody ToDo todo){
        return toDoRepository.save(todo);
    }

    @DeleteMapping("/todos/{id}")
    void delete(@PathVariable Integer id){
        toDoRepository.deleteById(id);
    }

}
