package com.DoctorHospital.DoctorHospital.dto.request;

import com.DoctorHospital.DoctorHospital.model.Doctor;
import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientListRequestDto {
	private String name;
	private Integer age;
	private String gender;
	@JsonIgnore
	private Doctor doctor;
	private Integer status;
}
