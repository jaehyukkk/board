package com.example.board.board.service;

import com.example.board.board.domain.dto.BoardRequestDto;
import com.example.board.board.domain.dto.BoardResponseDto;
import com.example.board.board.domain.entity.Board;
import com.example.board.board.domain.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public Board create(BoardRequestDto boardRequestDto) {
        return boardRepository.save(boardRequestDto.toEntity());
    }

    public List<BoardResponseDto> get() {
        return boardRepository.findAll().stream()
                .map(BoardResponseDto::of)
                .collect(Collectors.toList());
    }
}
