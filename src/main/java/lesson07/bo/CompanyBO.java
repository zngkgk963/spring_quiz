package lesson07.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lesson07.dao.CompanyRepository;
import lesson07.entity.CompanyEntity;

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
}
