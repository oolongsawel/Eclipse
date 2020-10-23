package com.multicampus.biz.user;
import java.util.List;

public class UserServiceClient {
	 public static void main(String[] args) {
		UserService userService = new UserServiceImpl(new UserDAO());
		
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		
		UserVO user = userService.getUser(vo);
		if(user != null) {
			System.out.println(user.getName()  + "님이로그인 성공하셨습니다");
		} else {
			System.out.println("로그인실패!");
		}
	}
	}
