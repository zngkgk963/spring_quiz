package com.quiz.lesson07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson07.dao.RecruitRepository;
import com.quiz.lesson07.entity.RecruitEntity;

@RequestMapping("/lesson07/quiz02")
@RestController
public class Lesson07Quiz02RestController {
	// (/lesson07/quiz02/1)
	
	@Autowired
	private RecruitRepository recruitRepository;
	
	@GetMapping("/1")
	public RecruitEntity quiz02_1() {
		return recruitRepository.findById(8).orElse(null);
	}
}
