package com.example.board.board.controller;

import com.example.board.board.domain.dto.BoardRequestDto;
import com.example.board.board.domain.dto.BoardResponseDto;
import com.example.board.board.domain.entity.Board;
import com.example.board.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/api/v1/board")
    public ResponseEntity<Board> create(@RequestBody BoardRequestDto boardRequestDto) {
        return ResponseEntity.ok(boardService.create(boardRequestDto));
    }

    @GetMapping("/api/v1/board")
    public ResponseEntity<List<BoardResponseDto>> get() {
        return ResponseEntity.ok(boardService.get());
    }
}
