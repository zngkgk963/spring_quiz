package lesson07.dao;

import org.springframework.stereotype.Repository;

import lesson07.entity.CompanyEntity;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, Integer> {
	// Spring data JPA
	
	// save()
	
}
