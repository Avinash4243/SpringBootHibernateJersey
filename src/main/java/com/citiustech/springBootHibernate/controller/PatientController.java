package com.citiustech.springBootHibernate.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.citiustech.springBootHibernate.exception.ResourceNotFoundException;
import com.citiustech.springBootHibernate.model.Patient;
import com.citiustech.springBootHibernate.repository.PatientRespository;

@Path("/api")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PatientController {
	
	@Autowired
	PatientRespository patientRepository;
	
	@POST
	@Path("/patients")
	public Patient createPatient(@Valid @RequestBody Patient patient) {		
	    return patientRepository.save(patient);
	}
	@GET
	@Path("/patients")
	public List<Patient> getAllPatients(){		
		return patientRepository.findAll();
	}
	@GET
	@Path("/patients/{id}")
	public Patient getPatient(@PathParam("id") Long id){
		System.out.println(id);
		System.out.println(patientRepository.findById(id));
		return patientRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Name", "Field", id));
				
				
	}
	@GET
	@Path("/patients/MRN/{mrn}")
	public Patient getPatient(@PathParam("mrn") String mrn){
		return patientRepository.findByMrn(mrn);
			
	}
	@PUT
	@Path("/patients/{id}")
	public Patient updateNote(@PathParam("id") Long id,
	                                        @Valid @RequestBody Patient patientDetails) {

		Patient patient = patientRepository.findById(id).get();
	           
		
		patient.setMrn(patientDetails.getMrn());
		patient.setCity(patientDetails.getCity());
		patient.setName(patientDetails.getName());

	    Patient updatedPatient = patientRepository.save(patient);
	    return updatedPatient;
	}
	@DELETE
	@Path("/patients/{id}")
	public ResponseEntity<?> deleteNote(@PathParam("id") Long id) {
		Patient patient = patientRepository.findById(id).get();
//				.orElseThrow(() -> new ResourceNotFoundException("Name", "Field", id));       

		patientRepository.delete(patient);

	    return ResponseEntity.ok().build();
	}
}
