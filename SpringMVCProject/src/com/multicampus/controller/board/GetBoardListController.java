package com.multicampus.controller.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.multicampus.biz.board.BoardDAO;
import com.multicampus.biz.board.BoardVO;

public class GetBoardListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("�� ��� �˻� ��� ó��");
		
		// 1. ����� �Է����� ����
		request.setCharacterEncoding("EUC-KR");
		String searchCondition = request.getParameter("searchCondition");
		String searchKeyword = request.getParameter("searchKeyword");
		
		// Null Check
		if(searchCondition == null) searchCondition = "TITLE";
		if(searchKeyword == null) searchKeyword = "";
		
		// 2. DB ���� ó��
		BoardVO vo = new BoardVO();
		vo.setSearchCondition(searchCondition);
		vo.setSearchKeyword(searchKeyword);
		
		BoardDAO boardDAO = new BoardDAO();
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		
		// 3. �˻� ����� JSP���� ����� �� �ֵ��� ���ǿ� ����ϰ� JSP�� �̵��Ѵ�.
		HttpSession session = request.getSession();
		session.setAttribute("boardList", boardList);
		//response.sendRedirect("getBoardList.jsp");
		
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("getBoardList.jsp");
		
		return mav;
	}

}
