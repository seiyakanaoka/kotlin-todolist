package com.todoList.Service

import com.todoList.Repository.TodoRepository
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor
class TodoService(private val todoRepository: TodoRepository) {

}