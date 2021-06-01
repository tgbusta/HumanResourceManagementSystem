package javacamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="job_titles")
public class JobTitle {
	
	@Id
	@GeneratedValue
	@Column(name="id" , nullable=false)
	private int id;
	@Column(name="title" , nullable=false)
	private String title;

}
