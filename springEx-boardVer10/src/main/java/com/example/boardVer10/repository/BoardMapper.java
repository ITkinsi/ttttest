package com.example.boardVer10.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.boardVer10.model.board.Board;

@Mapper
public interface BoardMapper {
	public int saveBoard(Board board);
	
	public List<Board> findAllBoards();
	
	public Board findBoardById(long id);
	
	public int updateBoard(Board board);
	
	public int removeBoard(long id);
}
