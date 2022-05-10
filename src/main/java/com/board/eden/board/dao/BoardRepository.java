package com.board.eden.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.board.eden.board.model.Board;
import com.board.eden.board.model.BoardUploadFile;

public interface BoardRepository {
	
	// BoardRepository 인터페이스의 메서드는 BoardService 클래스에서 사용한다. 이들 메서드는 게시글을 입력/수정/삭제/조회하는 기능을 수행한다.
	
	int selectMaxAricleNo();
	int selectMaxFileId();
	
	void insertArticle(Board board);
	void insertFileData(BoardUploadFile file);
	
	// Mybatis의 SQL 문장에 다수의 파라미터를 전달할 때는 전달되는 변수들에 꼭 @Param 어노테이션을 붙여줘야 한다.
	List<Board> selectArticleListByCategory(@Param("categoryId") int categoryId, @Param("start") int start, @Param("end") int end);
	
	Board selectArticle(int boardId);
	BoardUploadFile getFile(int fileId);
	
	void updateReadCount(int boardId);
	void updateReplyNumber(@Param("masterId") int masterId, @Param("replyNumber") int replyNumber);
	void replyArticle(Board boardId);
	
	String getPassword(int boardId);
	void updateArticle(Board board);
	void updateFileData(BoardUploadFile file);
	
	void deleteFileData(int boardId);
	void deleteReplyFileData(int boardId);
	Board selectDeleteArticle(int boardId);
	void deleteArticleByBoardId(int boardId);
	void deleteArticleByMasterId(int boardId);

	int selectTotalArticleCount();
	int selectTotalArticleCountByCategoryId(int categoryId);
	List<Board> searchListByContentKeyword(String keyword);
		
}
