package com.quiz.lesson06;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.lesson06.bo.BookMarkBO;
import com.quiz.lesson06.domain.BookMark;

@RequestMapping("/lesson06/quiz01")
@Controller
public class Lesson06Quiz01Controller {
	
	@Autowired
	private BookMarkBO bookMarkBO;
	
	@GetMapping("/add_book_mark_view")
	public String addBookMarkView() {
		return "lesson06/addBookMark";
	}
	
	@GetMapping("/book_mark")
	public String bookMarkView(Model model) {
		List<BookMark> bookMarkList = bookMarkBO.getBookMarkList();
		model.addAttribute("bookMarkList", bookMarkList);
		return "lesson06/bookMark";
	}
	
	
}
