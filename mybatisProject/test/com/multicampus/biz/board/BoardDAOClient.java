package com.multicampus.biz.board;

import java.sql.SQLException;
import java.util.List;

import com.multicampus.biz.board.impl.BoardDAO;

public class BoardDAOClient {	
	public static void main(String[] args) throws SQLException {
		BoardDAO boardDAO = new BoardDAO();
		
		BoardVO vo = new BoardVO();
		vo.setTitle("MyBaits 제목");
		vo.setWriter("홍길동");
		vo.setContent("MyBatis 내용.....");		
		boardDAO.insertBoard(vo);
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		for (BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
	}
}
