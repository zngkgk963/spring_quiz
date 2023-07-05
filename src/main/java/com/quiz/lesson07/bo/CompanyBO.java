package com.quiz.lesson07.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson07.dao.CompanyRepository;
import com.quiz.lesson07.entity.CompanyEntity;

@Service
public class CompanyBO {
	
	@Autowired
	private CompanyRepository companyRepository;

	// input: 파라미터들
	// output: entity
	public CompanyEntity addCompany(String name, String business, String scale, int headcount) {
		CompanyEntity company = companyRepository.save(
				CompanyEntity.builder()
				.name(name)
				.business(business)
				.scale(scale)
				.headcount(headcount)
				.build());
		return company;
	}
	
	public CompanyEntity updateCompany();
	
//	public StudentEntity updateStudentDreamJobById(int id, String dreamJob) {
//		// 기존 데이터 조회(id로)
//		StudentEntity student = studentRepository.findById(id).orElse(null);
//		
//		// entity 변경(dreamJob 변경) => save
//		if (student != null) {
//			student = student.toBuilder() // toBuilder는 기존값 유지하고 일부만 변경
//				.dreamJob(dreamJob)
//				.build();
//			
//			student = studentRepository.save(student); // update
//		}
//		
//		return student;
//	}
}