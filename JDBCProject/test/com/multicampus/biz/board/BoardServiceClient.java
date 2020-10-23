package com.multicampus.biz.board;

import java.util.List;

public class BoardServiceClient {
	public static void main(String[] args) {
		
		// 1.����Ͻ� ������Ʈ�� �����Ѵ�
		BoardService boardService = new BoardServiceImpl(new BoardDAO());
		
		// 2. ����Ͻ� �޼ҵ带 �׽�Ʈ�Ѵ�
		BoardVO vo = new BoardVO();
		vo.setTitle("JDBC�׽�Ʈ");
		vo.setWriter("�׽���");
		vo.setContent("JDBC ��� �׽�Ʈ");
		boardService.insertBoard(vo);
		
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for( BoardVO board : boardList) {
			System.out.println("---->" + board.toString());
		}
		
	}
}
