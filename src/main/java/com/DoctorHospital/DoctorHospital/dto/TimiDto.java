package com.DoctorHospital.DoctorHospital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimiDto {
	private Integer age;
	private Integer	STchanges;
	private Integer kah;
	private Integer stenosis;
	private Integer angina;
	private Integer ASA;
	private Integer cardiacMarker;
	private Integer total;
	
	public Integer calculate() {
		return age+STchanges+kah+stenosis+angina+ASA+cardiacMarker;
	}
}
