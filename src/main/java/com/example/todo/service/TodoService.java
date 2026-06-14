package com.example.todo.service;

import com.example.todo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private final List<Todo> todos = new ArrayList<>();
    private long id = 1;

    public List<Todo> getAll() {
        return todos;
    }

    public Todo addTodo(String title) {
        Todo todo = new Todo(id++, title);
        todos.add(todo);
        return todo;
    }
}