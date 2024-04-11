package com.DoctorHospital.DoctorHospital;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.DoctorHospital.DoctorHospital.query.ClinicInfoQuery;
import com.DoctorHospital.DoctorHospital.query.DoctorQuery;
import com.DoctorHospital.DoctorHospital.query.PatientQuery;
import com.DoctorHospital.DoctorHospital.query.ScoreQuery;

@SpringBootApplication
public class DoctorHospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorHospitalApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	@Bean
	public ClinicInfoQuery query() {
		return new ClinicInfoQuery();
	}
	
	@Bean
	public PatientQuery patientQuery() {
		return new PatientQuery();
	}
	
	@Bean
	public DoctorQuery doctorQuery() {
		return new DoctorQuery();
	}
	
	@Bean
	public ScoreQuery scoreQuery() {
		return new ScoreQuery();
	}
}
