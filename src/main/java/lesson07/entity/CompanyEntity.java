package lesson07.entity;

import java.time.ZonedDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@ToString	// 객체값 예쁘게 출력
@AllArgsConstructor // 파라미터 있는 생성자
@NoArgsContructor // 기본 생성자
@Getter // getter
@Builder // setter 대용
@Table(name = "company")
@Entity
public class CompanyEntity {
	@Id // pk
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String business;
	
	private String scale;
	
	private int headcount;
	
	@UpdateTimestamp
	@Column(name = "createdAt", updatable = false)
	private ZonedDateTime createdAt;
	
	@UpdateTimestamp
	@Column(name = "createdAt")
	private ZonedDateTime updatedAt;
}
