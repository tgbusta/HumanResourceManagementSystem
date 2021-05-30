package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.entities.concretes.JobTitle;


public interface JobTitleService {

	List<JobTitle> getAll();

}
