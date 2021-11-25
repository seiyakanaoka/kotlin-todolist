package com.todoList.Controller

import com.todoList.Service.TodoService
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller
@RequiredArgsConstructor
class TodoController(private val todoService: TodoService) {

    /**
     * 一覧画面表示("/")
     * @param model Model
     */
    @GetMapping
    private fun index(model: Model): String {
        return "index"
    }

    /**
     * 投稿処置("register")
     *
     */
//    @PostMapping("/register")
//    private fun post(): String {
//
//    }
}