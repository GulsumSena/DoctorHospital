package com.DoctorHospital.DoctorHospital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GraceDto {
	private Integer age;
	private Integer heartRate;
	private Integer bloodPressure;
	private Integer kreatinin;
	private Integer killip;
	private Integer arrest;
	private Integer cardiacMarker;
	private Integer STsegment;
	private Integer total;
	
	public Integer calculate() {
		return age+heartRate+bloodPressure+kreatinin+killip
				+arrest+cardiacMarker+STsegment;
	}
}
