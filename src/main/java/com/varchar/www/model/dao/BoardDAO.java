package com.varchar.www.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.varchar.www.model.domain.board.BoardGroupList;
import com.varchar.www.model.domain.board.PostDetail;
import com.varchar.www.model.domain.board.Posts;
import com.varchar.www.model.domain.board.PostsList;
import com.varchar.www.model.domain.board.TemporaryPost;
import com.varchar.www.model.domain.board.TemporaryPostList;
import com.varchar.www.model.domain.comment.Comment;
import com.varchar.www.model.domain.comment.ReplyComment;

/*
 * @Mapper public interface BoardDAO { List<BoardGroupList> getNavbar(String
 * userId); void insertBoardGroup(@Param("content")String
 * content, @Param("lectureCode")String lectureCode); void
 * updateBoardGroupName(@Param("boardGroupName")String boardGroupName,
 * 
 * @Param("changeBoardGroupName")String changeName,@Param("boardGroupNo")int
 * boardGroupNo); void insertBoard (@Param("content")String
 * content, @Param("boardGroupNo") int boardGroupNo); List<PostsList>
 * getPostList(int boardNo);
 * 
 * public Posts getPost();
 * 
 * }
 */
public interface BoardDAO {
	// 게시판 내비게이션 바 조회
	List<BoardGroupList> getNavbar(String userId);
	//게시판 그룹 등록
	void insertBoardGroup(@Param("content")String content, @Param("lectureCode")String lectureCode);
	//게시판 그룹 수정
	void updateBoardGroupName(@Param("boardGroupName")String boardGroupName,
							  @Param("changeBoardGroupName")String changeName,@Param("boardGroupNo")int boardGroupNo);
	// 게시판 이름 조회
	String getBoardName(int boardNo);
	
	// 게시판 등록
	void insertBoard (@Param("content")String content, @Param("boardGroupNo") int boardGroupNo);
	// 게시글 리스트
	PostsList getPostList(int boardNo);
	// 게시글 Detail
	PostDetail getPost(@Param("boardNo") int boardNo,@Param("postNo") int postNo);
	// 게시글 등록 - 임시저장 가져오기
	List<TemporaryPostList> getTemporaryPostList(String userId);
	
	// 게시글 검색 - 일자 검색
	List<Posts> getSearchDatePostList(@Param("boardNo") int boardNo,
						@Param("startDate")String startDate, @Param("endDate")String endDate);
	
	
	// 게시글 등록
	void insertPosts(Posts posts);
	// 게시글 임시저장
	void insertTemporaryPost(TemporaryPost temporaryPost);
	// 임시저장된 게시글 불러오기
	TemporaryPost getTemporaryPost(int temporaryNo);
	
	// 댓글 등록
	void insertPostComment(@Param("comment")Comment comment, @Param("postNo")int postNo);
	
	// 댓글 조회
	List<Comment> getCommentList(int postNo);
	
	// 답글 등록
	void insertReply(@Param("comment")Comment comment, @Param("postNo")int postNo);
	// 답글 조회
	List<ReplyComment> getReplyInReply(@Param("replyNo") int commentNo);
	
	
}

