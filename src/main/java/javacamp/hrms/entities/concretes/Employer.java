package javacamp.hrms.entities.concretes;

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
@Table(name="employers")

public class Employer extends User{

	@Column(name="company_name", nullable=false)
	private String companyName;
	
	@Column(name="web_adress", nullable=false)
	private String webAdress;
	
	@Column(name="phone_number",nullable = false)
	private String phoneNumber;
		
	@Column (name="is_active" , nullable=false)
	private boolean isActive=false;
	
}
