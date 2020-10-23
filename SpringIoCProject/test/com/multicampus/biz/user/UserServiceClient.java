package com.multicampus.biz.user;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.multicampus.biz.board.BoardService;
import com.multicampus.biz.board.BoardVO;


public class UserServiceClient {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = 
				new ClassPathXmlApplicationContext("business-layer.xml");
		
		
		UserService userService = (UserService) container.getBean("userService");
		BoardService boardService = (BoardService)  container.getBean("boardService");
		
		
		if(userService != null ) {
			System.out.println("Look up ����");
		} else {
			System.out.println("Look up ����");
		}
		
		
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		
		UserVO user = userService.getUser(vo);
		
		if(user != null ) {
			System.out.println(user.getName() + "�� �α��μ���");
			System.out.println("[ BOARD LIST] ");
			List<BoardVO> boardlist = boardService.getBoardList(new BoardVO());
			
			for(BoardVO board : boardlist) {
				System.out.println("=====>"  + board.toString());
			}
			
		} else {
			System.out.println("�α��� ����");
		}
		
		container.close();
		
		
		
	}
}
