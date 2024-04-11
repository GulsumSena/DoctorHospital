package com.DoctorHospital.DoctorHospital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlvaradoDto {
	private Integer pain;
	private Integer lossOfAppetite;
	private Integer vomiting;
	private Integer abdominalSensivity;
	private Integer rebound;
	private Integer fever;
	private Integer leukocytosis;
	private Integer leftShift;
	private Integer total;
	
	public Integer calculate() {
		return pain+lossOfAppetite+vomiting+abdominalSensivity
				+rebound+fever+leukocytosis+leftShift;
	}
}
