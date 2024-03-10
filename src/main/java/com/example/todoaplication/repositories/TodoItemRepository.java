package com.example.todoaplication.repositories;

import com.example.todoaplication.models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TodoItemRepository extends JpaRepository<TodoItem,Long> {

}
