package com.spring.bf.bbsLike;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsLikeController {
	@Autowired
	BbsLikeDAO dao;
	
	@RequestMapping("bbs/likeUp")
	public void insert(BbsLikeVO vo) {
		dao.insert(vo);
	}
	
	@RequestMapping("bbs/likeDown")
	public void delete(BbsLikeVO vo) {
		dao.delete(vo);
	}
	
	@RequestMapping("bbs/login")
	public void login(String id, HttpSession session) {
		session.setAttribute("id", id);
	}
	
	@RequestMapping("bbs/logout")
	public void logout(HttpSession session) {
		session.invalidate();
	}
	
}
