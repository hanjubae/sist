package memberFrameDTO;

import java.io.Serializable;
import java.util.Date;

public class BbsDTO implements Serializable {
	//Bulletin Board System
	private int seq;
	private String id;
	
	private String title; // 제목
	private String content;	// 내용
	private String wdate; // 작성일
	
	private int readcount;	// 조회수
	
	public BbsDTO() {}

	public BbsDTO(String id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	@Override
	public String toString() {
		return seq + "-" + id + "-" + title + "-" + content + "-" + wdate
				+ "-" + readcount;
	}
	
	
}












