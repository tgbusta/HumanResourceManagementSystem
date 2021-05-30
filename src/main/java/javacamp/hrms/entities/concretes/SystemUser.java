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
@Table(name="system_users")

public class SystemUser extends User{

	@Column(name="first_name", nullable=false)
	private String firtName;
	
	@Column(name="last_name", nullable=false)
	private String lastName;
	
}
