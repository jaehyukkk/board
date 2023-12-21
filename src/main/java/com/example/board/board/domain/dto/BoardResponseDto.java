package com.example.board.board.domain.dto;
import com.example.board.board.domain.entity.Board;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BoardResponseDto {

    private Long id;
    private String title;
    private String content;
    private String writer;


    public static BoardResponseDto of(Board board) {
        BoardResponseDto boardResponseDto = new BoardResponseDto();
        boardResponseDto.setId(board.getId());
        boardResponseDto.setTitle(board.getTitle());
        boardResponseDto.setContent(board.getContent());
        boardResponseDto.setWriter(board.getWriter());
        return boardResponseDto;
    }
}
