package com.board.eden.board.model;

public class BoardUploadFile {
	
	// 게시판에 첨부될 파일의 정보를 저장할 클래스이다. 몇 번 게시글의 첨부파일인지 알아야 하므로 boardId를 가져야 한다. 첨부파일 데이터를 저장할 변수의 타입은 byte[]으로 선언한다.
	
	private int fileId;        		  // 파일 아이디, 1씩 증가
	private int boardId;       		  // 첨부파일이 있는 게시글의 아이디(글번호)
	private String fileName;   		  // 파일 이름
	private long fileSize;     		  // 파일 크기
	private String fileContentType;   // 파일 타입(MIME Type)
	private byte[] fileData;          // 파일 데이터
	public int getFileId() {
		return fileId;
	}
	public void setFileId(int fileId) {
		this.fileId = fileId;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileContentType() {
		return fileContentType;
	}
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}
	public byte[] getFileData() {
		return fileData;
	}
	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}
	
	// toString 메서드 구현할 때 fileData 변수는 리턴 값에 포함하지 않는다.
	@Override
	public String toString() {
		return "BoardUploadFile [fileId=" + fileId + ", boardId=" + boardId + ", fileName=" + fileName + ", fileSize="
				+ fileSize + ", fileContentType=" + fileContentType + "]";
	}
}
