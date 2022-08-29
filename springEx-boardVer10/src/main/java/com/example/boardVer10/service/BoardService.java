package com.example.boardVer10.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.boardVer10.repository.BoardMapper;
import com.example.boardVer10.model.board.Board;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BoardService {
	
	private final BoardMapper boardMapper;
	
	public void saveBoard(Board board) {
        boardMapper.saveBoard(board);
    }
	
	public List<Board> findAllBoards(){
		List<Board> boards = boardMapper.findAllBoards();
		if (boards == null || boards.size()== 0) {
			return null;
		}
		return boards;
	}
	
	public Board readBoard(long id) {
		return null;
	}
	
	public void updateBoard(Board board) {
		boardMapper.updateBoard(board);
	}
	public void removeBoard(long id) {
		boardMapper.removeBoard(id);
	}
}
