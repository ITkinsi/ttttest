package com.example.boardVer10.model.board;

import javax.validation.constraints.NotBlank;

import com.example.boardVer10.model.board.WriteBoardForm;

import lombok.Data;

@Data
public class WriteBoardForm {
	@NotBlank
    private String title;
    @NotBlank
    private String content;
}