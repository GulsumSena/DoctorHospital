package com.DoctorHospital.DoctorHospital.dto;

import java.time.LocalDateTime;

import com.DoctorHospital.DoctorHospital.model.Doctor;
import com.DoctorHospital.DoctorHospital.model.Patient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClinicInfoDto {
	private Long id;
	private String body;
	private LocalDateTime time;
	private Doctor doctor;
	private Patient patient;
}
