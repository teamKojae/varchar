package com.varchar.www.model.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.varchar.www.model.dao.BoardDAO;
import com.varchar.www.model.domain.board.BoardGroupList;
import com.varchar.www.model.domain.board.Posts;
import com.varchar.www.model.domain.board.PostsList;
import com.varchar.www.model.service.BoardService;

@Service("boardServiceImpl")
public class BoardServiceImpl implements BoardService {

	@Autowired BoardDAO boardDAO;
	
	@Override
	public List<BoardGroupList> getNavbar(String userId) {
		
		return boardDAO.getNavbar(userId);
	}

	@Override
	@Transactional
	public void insertBoardGroup(String content, String lectureCode) {
		boardDAO.insertBoardGroup(content, lectureCode);
		
	}

	@Override
	public void updateBoardGroupName(String boardGroupName, String changeName,int boardGroupNo) {
		boardDAO.updateBoardGroupName(boardGroupName, changeName,boardGroupNo);
		
	}

	@Override
	public void insertBoard(String content, int boardGroupNo) {
		boardDAO.insertBoard(content, boardGroupNo);
		
	}

	@Override
	public List<PostsList> getPostList(int boardNo) {
		return boardDAO.getPostList(boardNo);
	}

	@Override
	public Posts getPost() {
		return boardDAO.getPost();
	}

}
