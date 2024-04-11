package com.DoctorHospital.DoctorHospital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HeartDto {
	private Integer history;
	private Integer ekg;
	private Integer age;
	private Integer risk;
	private Integer trop;
	private Integer total;
	
	public Integer calculate() {
		return history+ekg+age+risk+trop;
	}
}
