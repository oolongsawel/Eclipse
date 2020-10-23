package com.multicampus.biz.user;

import java.util.List;


public class UserServiceImpl implements UserService{

	private UserDAO userDAO;
	
	public UserServiceImpl(UserDAO userDAO) {
		super();
		this.userDAO = userDAO;
	}
	
	@Override
	public void insertUser(UserVO vo) {
		// TODO Auto-generated method stub
		userDAO.insertUser(vo);
	}

	@Override
	public void updateUser(UserVO vo) {
		// TODO Auto-generated method stub
		userDAO.updateUser(vo);
	}

	@Override
	public void deleteUser(UserVO vo) {
		// TODO Auto-generated method stub
		userDAO.deleteUser(vo);
	}

	@Override
	public UserVO getUser(UserVO vo) {
		// TODO Auto-generated method stub
		return userDAO.getUser(vo);
	}

	@Override
	public List<UserVO> getUserList(UserVO vo) {
		// TODO Auto-generated method stub
		return userDAO.getUserList(vo);
	}
}
