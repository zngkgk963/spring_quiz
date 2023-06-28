package com.quiz.lesson06.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson06.dao.BookMarkMapper;
import com.quiz.lesson06.domain.BookMark;

@Service
public class BookMarkBO {
	@Autowired
	private BookMarkMapper bookMarkMapper;

	public List<BookMark> getBookMarkList() {
		return bookMarkMapper.selectBookMarkList();
	}
}
