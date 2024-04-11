package com.DoctorHospital.DoctorHospital.dto;

import java.util.List;

import com.DoctorHospital.DoctorHospital.model.Doctor;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BranchDto {
	private Long id;
	private String nameBranch;
	@JsonIgnore
	private List<Doctor> doctors;
}
