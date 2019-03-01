package com.citiustech.springBootHibernate.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.citiustech.springBootHibernate.model.Patient;

@Repository
public interface PatientRespository extends PatientSearchByMRN {
//	@Query("select p from Patient p where p.mrn = :mrn")
	Patient findByMrn(String mrn);
//	Patient findByMrn(String mrn);
//	Patient findByMrn(String mrn);
//	Patient save(Patient p);
//	void delete(Patient p);
//	List<Patient> findAll();

}
