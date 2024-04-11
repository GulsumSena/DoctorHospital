package com.DoctorHospital.DoctorHospital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MasccDto {
	private Integer symptom;
	private Integer hypotension;
	private Integer koah;
	private Integer tumor;
	private Integer dehydration;
	private Integer fever;
	private Integer age;
	private Integer total;
	
	public Integer calculate() {
		return symptom+hypotension+koah+tumor+dehydration+fever+age;
}
}
