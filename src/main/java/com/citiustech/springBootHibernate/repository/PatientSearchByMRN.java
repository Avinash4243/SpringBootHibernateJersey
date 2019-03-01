package com.citiustech.springBootHibernate.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.citiustech.springBootHibernate.model.Patient;

@NoRepositoryBean
public interface PatientSearchByMRN extends JpaRepository<Patient, Long>{	
	

}
