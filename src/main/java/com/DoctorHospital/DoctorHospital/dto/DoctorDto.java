package com.DoctorHospital.DoctorHospital.dto;

import java.util.List;

import com.DoctorHospital.DoctorHospital.model.Branch;
import com.DoctorHospital.DoctorHospital.model.Patient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDto {
	private Long id;
	private String nameDoctor;
	private List<Patient> patients;
	private String username;
	private String password;
	private Branch branch;
}
