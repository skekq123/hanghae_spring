package com.hanghae.myblog.controller;

import com.hanghae.myblog.domain.Board;
import com.hanghae.myblog.domain.BoardRepository;
import com.hanghae.myblog.domain.BoardRequestDto;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardRepository boardRepository;

    @GetMapping("myblog/boards")
    public List<Board> getBoards() {
        return boardRepository.findAllByOrderByModifiedAtDesc();
    }

    @PostMapping("myblog/boards")
    public Board createBoard(@RequestBody BoardRequestDto requestDto) {
        Board board = new Board(requestDto);
        return boardRepository.save(board);
    }
}