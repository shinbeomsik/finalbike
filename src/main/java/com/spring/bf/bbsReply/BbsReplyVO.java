package com.spring.bf.bbsReply;

import java.sql.Date;

public class BbsReplyVO {

	private int reply_no;
	private int bbs_no;
	private String writer;
	private Date date;
	private String content;

	public int getReply_no() {
		return reply_no;
	}

	public void setReply_no(int reply_no) {
		this.reply_no = reply_no;
	}

	public int getBbs_no() {
		return bbs_no;
	}

	public void setBbs_no(int bbs_no) {
		this.bbs_no = bbs_no;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "BbsReplyVO [reply_no=" + reply_no + ", bbs_no=" + bbs_no + ", writer=" + writer + ", date=" + date
				+ ", content=" + content + "]";
	}

}