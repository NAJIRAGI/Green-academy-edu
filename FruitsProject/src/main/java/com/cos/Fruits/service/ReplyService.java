package com.cos.Fruits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.Fruits.model.Reply;
import com.cos.Fruits.repository.ReplyRepository;

@Service
public class ReplyService {
	@Autowired
	private ReplyRepository replyRepository;
	
	@Transactional(readOnly = true)
	public List<Reply> 답변보기() {
		return replyRepository.findAll();
	}
	
	@Transactional
	public void 답변삭제하기(int id) {
		replyRepository.deleteById(id);
	}
}
