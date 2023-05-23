package com.spring.bf.bbs;

import java.sql.Date;

public class BbsVO {

	private int bbs_no;
	private String content;
	private String writer;
	private Date date;
	private int group_no;
	private String img;
	private int cmt_cnt;
	private int like_cnt;
	private int hit;
	private String group_name;
	private int start;
	private int end;
	private int page;

	public void setStartEnd(int page) {
		start = 1 + (page - 1) * 20;
		end = page * 20;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public int getCmt_cnt() {
		return cmt_cnt;
	}

	public void setCmt_cnt(int cmt_cnt) {
		this.cmt_cnt = cmt_cnt;
	}

	public int getLike_cnt() {
		return like_cnt;
	}

	public void setLike_cnt(int like_cnt) {
		this.like_cnt = like_cnt;
	}

	public int getBbs_no() {
		return bbs_no;
	}

	public void setBbs_no(int bbs_no) {
		this.bbs_no = bbs_no;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public int getGroup_no() {
		return group_no;
	}

	public void setGroup_no(int group_no) {
		this.group_no = group_no;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "BbsVO [bbs_no=" + bbs_no + ", content=" + content + ", writer=" + writer + ", date=" + date
				+ ", group_no=" + group_no + ", img=" + img + ", cmt_cnt=" + cmt_cnt + ", like_cnt=" + like_cnt
				+ ", hit=" + hit + ", group_name=" + group_name + "]";
	}

}
