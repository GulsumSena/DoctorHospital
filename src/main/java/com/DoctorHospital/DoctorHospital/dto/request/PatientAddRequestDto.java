package com.DoctorHospital.DoctorHospital.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientAddRequestDto {
	private String name;
	private Integer age;
	private String gender;
}
