package javacamp.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity
@Table(name="candidates")

public class Candidate extends User {

	@Column(name="first_name", nullable=false)
	private String firtName;
	
	@Column(name="last_name", nullable=false)
	private String lastName;
	
	@Column(name="identity_number",nullable = false, unique = true)
	private String identityNumber;
	
	@Column(name="birth_year", nullable=false)
	private Date birthYear;
	
	@Column (name="is_active" , nullable=false)
	private boolean isActive=false;
	
}
