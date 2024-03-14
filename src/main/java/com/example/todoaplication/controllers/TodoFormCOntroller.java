package com.example.todoaplication.controllers;

import ch.qos.logback.core.model.Model;
import com.example.todoaplication.models.TodoItem;
import com.example.todoaplication.services.TodoItemServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoFormCOntroller{

    @Autowired
    private TodoItemServices todoItemServices;

    @GetMapping("/create-todo")

    public String showCreateForm(TodoItem todoItem){
        return "new-todo-item";
    }

    @PostMapping("/todo")
    public String createTodoItem(@Valid TodoItem todoItem, BindingResult result, Model model){
        TodoItem item = new TodoItem();
        item.setDescription(todoItem.getDescription());
        item.setIsComplete(todoItem.getIsComplete());
        todoItemServices.save(todoItem);

        return "redirect:/";
    }
}