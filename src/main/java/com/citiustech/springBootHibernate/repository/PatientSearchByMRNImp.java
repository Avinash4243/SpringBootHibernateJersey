//package com.citiustech.springBootHibernate.repository;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.citiustech.springBootHibernate.model.Patient;
//@Repository
//@Transactional(readOnly=true)
//public class PatientSearchByMRNImp implements PatientSearchByMRN {
//	@PersistenceContext
//    EntityManager entityManager;
//	
//	@Override
//	public List<Patient> findByMrn(String mrn) {
//		Query query = entityManager.createNativeQuery("SELECT p.* from Patient AS p"+
//					"where p.mrn=?", Patient.class);
//        query.setParameter(1, mrn);
//        return (List<Patient>) query.getResultList();
//	}
//
//}
