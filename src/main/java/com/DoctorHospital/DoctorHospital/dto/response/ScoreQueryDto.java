package com.DoctorHospital.DoctorHospital.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScoreQueryDto {
	private Long patientID;
	private Long doctorID;
	private String nameScore;
	private String nameDoctor;
	private String namePatient;
	private Integer agePatient;
	private String gender;
	private Integer total;
}
