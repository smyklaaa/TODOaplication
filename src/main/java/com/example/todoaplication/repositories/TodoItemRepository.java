package com.example.todoaplication.repositories;

import com.example.todoaplication.models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public class TodoItemRepository extends JpaRepository<TodoItem,Long> {
}
