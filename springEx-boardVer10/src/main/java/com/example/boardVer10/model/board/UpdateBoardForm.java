package com.example.boardVer10.model.board;

import javax.validation.constraints.NotBlank;

import com.example.boardVer10.model.board.UpdateBoardForm;

import lombok.Data;

@Data
public class UpdateBoardForm {
	private long id;
    @NotBlank
    private String title;
    @NotBlank
    private String content;
}