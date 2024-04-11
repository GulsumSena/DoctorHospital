package com.DoctorHospital.DoctorHospital.dto;

import java.time.LocalDateTime;

import com.DoctorHospital.DoctorHospital.model.Doctor;
import com.DoctorHospital.DoctorHospital.model.Patient;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeathNoteDto {
	private Long id;
	private String note;
	@JsonIgnore
	private Doctor doctor;
	@JsonIgnore
	private Patient patient;
	private LocalDateTime time;
}
