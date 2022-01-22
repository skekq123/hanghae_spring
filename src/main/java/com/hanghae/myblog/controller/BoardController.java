package com.hanghae.myblog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @GetMapping("myblog/boards")
    public String getBoards() {
        return "main";
    }
}
